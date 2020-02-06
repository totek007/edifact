/* * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.edifree.edifact.main.all.parser;

import org.edifree.edifact.main.Edifact;
import org.edifree.edifact.main.all.annotations.TagName;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.main.all.exception.EdifactLibraryException;
import org.edifree.edifact.main.syntax.v3_0.Edifact30;
import org.edifree.edifact.main.syntax.v4_1.Edifact41;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Rafal Paszkowski
 */
@Slf4j
public class EdifactParser {

    private final Helper helper;

    public EdifactParser(EdifactSyntaxVersion edifactSyntaxVersion, EdifactVersion edifactVersion, EdifactType edifactType, String content) {
        this.helper = new Helper(edifactSyntaxVersion, edifactVersion, edifactType, content);
    }

    public EdifactParser(String content) throws EdifactLibraryException {
        this.helper = new Helper(content);
    }

    public Edifact parse() throws IllegalArgumentException, IllegalAccessException, InstantiationException, EdifactLibraryException, InvocationTargetException {
        Edifact edifact = getEdifact(helper.edifactSyntaxVersion);
        parse(edifact, DataType.UNKNOWN);
        return edifact;
    }

    private Edifact getEdifact(EdifactSyntaxVersion edifactSyntaxVersion) throws EdifactLibraryException {
        switch (edifactSyntaxVersion) {
            case VERSION_30:
                return new Edifact30();
            case VERSION_41:
                return new Edifact41();
            default:
                throw new EdifactLibraryException("Critical exception. No edifact syntax version found");
        }
    }

    private void parse(Object parentObject, DataType nextData) throws IllegalArgumentException, IllegalAccessException, InstantiationException, InvocationTargetException {
        for (Field field : parentObject.getClass().getDeclaredFields()) {
            parseSingleField(field, parentObject, nextData);
        }
    }

    private void parseSingleField(Field field, Object parentObject, DataType nextData) throws InstantiationException, IllegalAccessException, InvocationTargetException {
        field.setAccessible(true);
        if (itIsNextSegment(field)) {
            setSegment(field, parentObject);
            return;
        }
        switch (nextData) {
            case FIELD:
                setField(field, parentObject);
                break;
            case COMPONENT:
                setComponent(field, parentObject);
                break;
            case UNKNOWN:
            default:
                setNormalObject(field, parentObject);
        }
    }

    private boolean itIsNextSegment(Field field) {
        return field.getType().isAnnotationPresent(TagName.class);
    }

    private void setSegment(Field field, Object parentObject) throws IllegalArgumentException, IllegalAccessException, InstantiationException, InvocationTargetException {
        helper.setNextLine(getSegmentName(field));

        if (itIsList(field)) {
            EdifactList list = ((EdifactList) field.get(parentObject));
            list.runIfPrevNotEmpty(() -> {
                Object newInstance = createInstance(field);
                try {
                    parse(newInstance, DataType.FIELD);
                } catch (InstantiationException | IllegalAccessException | InvocationTargetException ex) {
                    Logger.getLogger(EdifactParser.class.getName()).log(Level.SEVERE, null, ex); //TODO !!!!
                }
                list.add(newInstance);
            });
            list.remove(list.size() - 1);
            if (list.isEmpty()) {
                field.set(parentObject, null);
            }
        }
        Object newInstance = getDefaultConstructor(field.getType().getConstructors()).newInstance();
        parse(newInstance, DataType.FIELD);
        if (isObjectEmpty(newInstance)) {
            field.set(parentObject, null);
        } else {
            field.set(parentObject, newInstance);
        }

    }

    private String getSegmentName(Field field) {
        return field.getType().getAnnotation(TagName.class).value();
    }

    private boolean itIsList(Field field) {
        if (Collection.class.isAssignableFrom(field.getType())) {
            if (isParameterizedList(field)) {
                return true;
            }
            //throw new Exception("Collection is not parameterized. You should set generic type");
        }
        return false;
    }

    private void setField(Field field, Object parentObject) throws IllegalArgumentException, IllegalAccessException, InstantiationException, InvocationTargetException {
        switch (field.getType().getSimpleName()) {
            case "String": {
                setFieldString(field, parentObject);
                break;
            }
            case "Decimal": {
                setFieldDecimal(field, parentObject);
                break;
            }
            default: {
                helper.increaseField();
                Object newInstance = getDefaultConstructor(field.getType().getConstructors()).newInstance();
                parse(newInstance, DataType.COMPONENT);
                field.set(parentObject, newInstance);
            }
        }

    }

    private void setFieldString(Field field, Object parentObject) throws IllegalArgumentException, IllegalAccessException {
        String value = helper.getNextFieldValue();
        if (value != null) {
            field.set(parentObject, value);//
        }
    }

    private void setFieldDecimal(Field field, Object parentObject) throws IllegalArgumentException, IllegalAccessException {
        String value = helper.getNextFieldValue();
        if (value == null || value.isEmpty()) {
            field.set(parentObject, null);
        } else {
            field.set(parentObject, new Decimal(value));
        }
    }

    private void setComponent(Field field, Object parentObject) throws IllegalArgumentException, IllegalAccessException, InstantiationException, InvocationTargetException {
        String value = helper.getNextComponentValue();

        switch (field.getType().getSimpleName()) {
            case "String": {
                if (value != null) {
                    field.set(parentObject, value);
                }
                break;
            }
            case "Decimal": {
                if (value == null || value.isEmpty()) {
                    field.set(parentObject, null);
                } else {
                    field.set(parentObject, new Decimal(value));
                }
                break;
            }
            default: {
                helper.increaseField();
                Object newInstance = getDefaultConstructor(field.getType().getConstructors()).newInstance();
                parse(newInstance, DataType.COMPONENT);
                if (isObjectEmpty(newInstance)) {
                    field.set(parentObject, null);
                } else {
                    field.set(parentObject, newInstance);
                }
            }
        }

    }

    private boolean isObjectEmpty(Object e) throws IllegalArgumentException, IllegalAccessException {
        for (Field field : e.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            if (Collection.class.isAssignableFrom(field.getType())) {
                List get = (List) field.get(e);
                if (get != null) {
                    for (Object o : get) {
                        if (!isObjectEmpty(o)) {
                            return false;
                        }
                    }
                }
            } else {
                Object value = field.get(e);
                if (value != null) {
                    if (value instanceof Decimal) {
                        return false;
                    }
                    if (value instanceof String) {
                        return false;
                    }
                    if (!isObjectEmpty(value)) {
                        return false;
                    }
                }

            }
        }
        return true;
    }

    private void setNormalObject(Field field, Object parentObject) throws IllegalArgumentException, IllegalAccessException, InstantiationException, InvocationTargetException {
        if (itIsList(field)) {

            final EdifactList list = ((EdifactList) field.get(parentObject));
            list.runIfPrevNotEmpty(() -> {
                Object newInstance = createInstance(field);
                try {
                    if (newInstance.getClass().isAnnotationPresent(TagName.class)) {
                        helper.setNextLine(newInstance.getClass().getAnnotation(TagName.class).value());
                        parse(newInstance, DataType.FIELD);
                    } else {
                        parse(newInstance, DataType.UNKNOWN);
                    }
                } catch (InstantiationException | IllegalAccessException | InvocationTargetException ex) {
                    Logger.getLogger(EdifactParser.class.getName()).log(Level.SEVERE, null, ex);  //TODO !!!!
                }

                list.add(newInstance);
            });
            list.remove(list.size() - 1);

            if (list.isEmpty()) {
                field.set(parentObject, null);
            }

        } else {
            if (itIsSimpleType(field)) {
                log.warn("Error. Probably, no segment tag in " + parentObject.getClass().getName());
            }
            Object newInstance = getDefaultConstructor(field.getType().getConstructors()).newInstance();
//            field.set(parentObject, newInstance);
            parse(newInstance, DataType.SEGMENT);
            if (isObjectEmpty(newInstance)) {
                field.set(parentObject, null);
            } else {
                field.set(parentObject, newInstance);
            }
        }
    }

    private boolean itIsSimpleType(Field field) {
        return field.getType().getSimpleName().equals("String") || field.getType().getSimpleName().equals("Decimal");
    }

    private boolean isParameterizedList(Field field) {
        return field.getGenericType() instanceof ParameterizedType;
    }

    private Object createInstance(Field field) {
        Class parameterizedTypeClass = getClass((ParameterizedType) field.getGenericType());
        if (parameterizedTypeClass.equals(MessageObject.class)) {
            String className = getClassName();
            try {
                return Class.forName(className).getDeclaredConstructor().newInstance();
            } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | ClassNotFoundException | NoSuchMethodException ex) {
                log.error(String.format("Unknown class for edifactVersion='%s' and edifactType='%s'.Searched class:'%s'",helper.edifactVersion.name(),helper.edifactType.name(),className));
            }
        }
        try {
            return parameterizedTypeClass.getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException ex) {
            //throw new Exception("Constructor coudn't be created. Error"+ex.getMessage());
        }
        throw new RuntimeException("Something went wrong");//TODO rpaszkowski
    }
    private String getClassName(){
        String edifactVersion = helper.edifactVersion.name().toLowerCase();
        String edifactTypePackage =helper.edifactType.name().toLowerCase();
        String edifactType =Character.toUpperCase(helper.edifactType.name().charAt(0)) + helper.edifactType.name().toLowerCase().substring(1);;

        return String.format("biz.brammer.esb.lib.objects.edifact.version.%s.message.%s.%s",edifactVersion,edifactTypePackage,edifactType);
    }

    private Class getClass(ParameterizedType parameterizedType) {
        return ((Class) parameterizedType.getActualTypeArguments()[0]);
    }

    private Constructor getConstructor(Class clazz) {
        return getDefaultConstructor(clazz.getConstructors());
    }

    private Constructor getDefaultConstructor(Constructor[] constructors) {
        for (Constructor constructor : constructors) {
            if (constructor.getParameterCount() == 0) {
                return constructor;
            }
        }
        return null;//TODO rpaszkowski - maybe better will be throw runtime exception?
    }



    private enum DataType {
        SEGMENT, FIELD, COMPONENT, UNKNOWN
    }

    class Helper {

        private final String content;
        private final Setting setting;
        private final EdifactSyntaxVersion edifactSyntaxVersion;
        private final EdifactVersion edifactVersion;
        private final EdifactType edifactType;
        private final List<LineElement> lineList = new ArrayList<>();

        private int indexField = 0;
        private int indexComponent = 0;
        private LineElement actualLine;

        public Helper(EdifactSyntaxVersion edifactSyntaxVersion, EdifactVersion edifactVersion, EdifactType edifactType, String content) {
            this.content = content;
            this.setting = Setting.getSetting(content);
            setLineList();
            this.edifactSyntaxVersion = edifactSyntaxVersion;
            this.edifactVersion = edifactVersion;
            this.edifactType = edifactType;
        }

        public Helper(String content) throws EdifactLibraryException {
            this.content = content;
            this.setting = Setting.getSetting(content);
            setLineList();
            this.edifactSyntaxVersion = getEdifactSyntaxVersion();
            this.edifactVersion = getEdifactVersion();
            this.edifactType = getEdifactType();
        }

        private void setLineList() {
            List<String> list = new ArrayList<>();

            StringBuilder sb = new StringBuilder();
            for (String s : content.split(String.valueOf(setting.getNextSegmentSign()))) {
                sb.append(s);
                String test = s.substring(s.length() - 1, s.length());
                if (test.equals(String.valueOf(setting.getNextSpecialSign()))) {
                    sb.append(setting.getNextSpecialSign() + setting.getNextSegmentSign());
                    continue;
                }
                list.add(sb.toString());
                sb.setLength(0);
            }

            for (String s : list) {
                if (s.length() < 4) {
                    continue;
                }
                if (s.contains("UNA")) {
                    lineList.add(new LineElement(setting));
                } else {
                    try {
                        lineList.add(new LineElement(s.replaceAll("\n", "").trim(), setting));
                    } catch (EdifactLibraryException e) {
                        log.error("Edifact Library Exception", e);
                    }
                }
            }
        }

        private String getNextSegmentSign() {
            return String.valueOf(setting.getNextSegmentSign());
        }

        private EdifactSyntaxVersion getEdifactSyntaxVersion() throws EdifactLibraryException {
            return EdifactSyntaxVersion.create(getUnbLine().getList().get(0).getComponentList().get(1));
        }

        private EdifactVersion getEdifactVersion() throws EdifactLibraryException {
            LineElement unhLine = getUnhLine();
            return EdifactVersion.create(unhLine.getList().get(1).getComponentList().get(1) + unhLine.getList().get(1).getComponentList().get(2));
        }

        private EdifactType getEdifactType() throws EdifactLibraryException {
            return EdifactType.create(getUnhLine().getList().get(1).getComponentList().get(0));
        }

        private LineElement getUnbLine() throws EdifactLibraryException {
            for (LineElement lineElement : lineList) {
                if (lineElement.getName().equals("UNB")) {
                    return lineElement;
                }
            }
            throw new EdifactLibraryException("Not find UNB tag");
        }

        private LineElement getUnhLine() throws EdifactLibraryException {
            for (LineElement lineElement : lineList) {
                if (lineElement.getName().equals("UNH")) {
                    return lineElement;
                }
            }
            throw new EdifactLibraryException("Not find UNH tag");
        }

        private void setNextLine(String edifactObjectTag) {
            if (!lineList.isEmpty()) {
                LineElement next = lineList.get(0);
                if (next.getName().equals(edifactObjectTag)) {
                    actualLine = next;
                    lineList.remove(0);
                    indexField = -1;
                    indexComponent = 0;
                }
            } else {
                actualLine = null;
            }
        }

        private String getNextFieldValue() {
            if (actualLine == null) {
                return null;
            }
            indexField++;
            if (indexField < actualLine.getList().size()) {
                return actualLine.getList().get(indexField).getComponentList().get(0);
            }
            return null;

        }

        private void increaseField() {
            indexField++;
            indexComponent = 0;
        }

        private String getNextComponentValue() {
            if (actualLine == null) {
                return null;
            }

            try {
                if (indexComponent == -1 || indexField >= actualLine.getList().size()) {
                    return null;
                }
                String results = actualLine.getList().get(indexField).getComponentList().get(indexComponent);

                if (actualLine.getList().get(indexField).getComponentList().size() - 1 > indexComponent) {
                    indexComponent++;
                } else {
                    indexComponent = -1;
                }

                return results;
            } catch (java.lang.IndexOutOfBoundsException e) {
                log.error("BLAD: " + actualLine.getName() + "," + indexField + "," + indexComponent, e); //TODO DODAC LOG!!!
                return null;
            }
        }

    }

    class LineElement {
        private final String text;
        private final String segmentName;
        private final List<FieldElement> list = new ArrayList<>();

        public LineElement(Setting setting) {
            this.text = getUnaText(setting);
            this.segmentName = getUnaSegmentName();
            setFieldUna(setting);
        }

        public LineElement(String text, Setting setting) throws EdifactLibraryException {
            this.text = text + setting.getNextSegmentSign();
            this.segmentName = getSegmentName(setting);
            setFieldsList(setting);
        }

        private String getUnaText(Setting setting) {
            return "UNA" + setting.getNextComponentSign() + setting.getNextFieldSign() + setting.getDecimalSign() + setting.getNextSpecialSign() + setting.getNextFutureSign() + setting.getNextSegmentSign() + "\n";
        }

        private String getUnaSegmentName() {
            return "UNA";
        }

        private void setFieldUna(Setting setting) {
            list.add(new FieldElement(String.valueOf(setting.getNextComponentSign())));
            list.add(new FieldElement(String.valueOf(setting.getNextFieldSign())));
            list.add(new FieldElement(String.valueOf(setting.getDecimalSign())));
            list.add(new FieldElement(String.valueOf(setting.getNextSpecialSign())));
            list.add(new FieldElement(String.valueOf(setting.getNextFutureSign())));
            list.add(new FieldElement(String.valueOf(setting.getNextSegmentSign())));
            list.add(new FieldElement(setting.getIgnoreCRLF()));
        }

        private String getSegmentName(Setting setting) throws EdifactLibraryException {
            try {
                while (true) {
                    int index = text.indexOf(setting.getNextFieldSign());
                    if (text.indexOf(index - 1) != setting.getNextSpecialSign()) {
                        return text.substring(0, index);
                    }
                }
            } catch (StringIndexOutOfBoundsException | NullPointerException e) {
                throw new EdifactLibraryException("BLAD w lini " + text, e);
            }
        }

        private void setFieldsList(Setting setting) {
            boolean nextSpecialChar = false;
            FieldElement dataField = null;
            StringBuilder sb = new StringBuilder();

            for (char c : getLineWithoutSegmentName(setting).toCharArray()) {
                if (isNextSpecialChar(setting, c)) {
                    if (nextSpecialChar) {
                        sb.append(c);
                    }
                    nextSpecialChar = true;
                    continue;
                }
                if (nextSpecialChar) {
                    sb.append(c);
                    nextSpecialChar = false;
                    continue;
                }
                sb.append(c);

                if (isNextComponent(setting, c)) {
                    if (dataField == null) {
                        dataField = new FieldElement();
                    }
                    dataField.getComponentList().add(sb.substring(0, sb.length() - 1));
                    sb.setLength(0);
                    continue;
                }

                if (isNextField(setting, c)) {
                    if (dataField == null) {
                        dataField = new FieldElement();
                    }
                    dataField.getComponentList().add(sb.substring(0, sb.length() - 1));
                    list.add(dataField);
                    dataField = null;
                    sb.setLength(0);
                }
            }
        }

        private String getLineWithoutSegmentName(Setting setting) {
            return text.substring(text.indexOf(setting.getNextFieldSign()) + 1);
        }

        private boolean isNextSpecialChar(Setting setting, char c) {
            return c == setting.getNextSpecialSign();
        }

        private boolean isNextComponent(Setting setting, char c) {
            return c == setting.getNextComponentSign();
        }

        private boolean isNextField(Setting setting, char c) {
            return c == setting.getNextFieldSign() || c == setting.getNextSegmentSign();
        }

        public String getName() {
            return segmentName;
        }

        public List<FieldElement> getList() {
            return list;
        }
    }

    class FieldElement {

        List<String> componentList = new ArrayList<>();

        public FieldElement() {
        }

        public FieldElement(String componentValue) {
            componentList.add(componentValue);
        }

        public List<String> getComponentList() {
            return componentList;
        }
    }
}
