package org.edifree.edifact.main.creator;

import org.edifree.edifact.main.creator.objects.*;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.nio.charset.Charset;
import java.util.*;

public class FileCreator {

    public HashMap<String, Group> segmentGroupList = new LinkedHashMap();
    public HashMap<String, Segment> segmentList = new LinkedHashMap();
    public HashMap<String, Field> fieldList = new LinkedHashMap();

    private File FOLDER_GENERATED_FILE = new File("generated");
    private Message actualMessage;
    private List<Message> list;

    public FileCreator(List<Message> list) {
        this.list = list;
        setLists();
    }

    private void setLists() {
        for (Message message : list) {
            for (Object object : message.getList()) {
                setListForSegmentOrGroup(object);
            }
        }
        for (Field field : fieldList.values()) {
            for(Segment segment:segmentList.values()){
                if(getClassName(segment.getName()).equals(getClassName(field.getName()))){
                    field.setName(field.getName()+" "+field.getId().toUpperCase());
                }
            }
        }
        for (Segment segment : segmentList.values()) {
            for(int i=0;i<segment.getList().size();i++){
                Object object = segment.getList().get(i);
                if(object instanceof Field){
                    Field field = (Field) object;
                    if(getClassName(segment.getName()).equals(getClassName(field.getName()))){
                        field.setName(field.getName()+" "+field.getId().toUpperCase());
                        segment.getList().set(i,field);
                    }
                }
            }
        }
    }

    private void setListForSegmentOrGroup(Object object) {
        if (object instanceof Segment) {
            setListForSegment((Segment) object);
        } else if (object instanceof Group) {
            setListForGroup((Group) object);
        }
    }

    private void setListForSegment(Segment segment) {
        segmentList.put(segment.getId(), segment);
        for (Object objectSegment : segment.getList()) {
            if (objectSegment instanceof Field) {
                Field field = (Field) objectSegment;
                fieldList.put(field.getId(), field);
            }
        }
    }

    private void setListForGroup(Group group) {
        segmentGroupList.put(group.getId(),group);
        for (Object object : group.getList()) {
            setListForSegmentOrGroup(object);
        }
    }


    public void createAllClass() throws IOException {
        for (Message message : list) {
            this.actualMessage = message;
            generateMessageClass();
            generateGroupClass();
        }
        generateSegmentClass();
        generateFieldClass();
    }

    private void generateGroupClass() throws IOException {
        for (Object object : actualMessage.getList()) {
            setListForSegmentOrGroup(object);
        }
        for (Group group : segmentGroupList.values()) {
            createGroupFile(group);
        }
        segmentGroupList.clear();
    }

    private void generateSegmentClass() throws IOException {
        for(Segment segment:segmentList.values()){
            createSegmentFile(segment);
        }
    }

    private void generateFieldClass() throws IOException {
        for (Field field : fieldList.values()) {
            createFieldFile(field);
        }
    }


    public void generateMessageClass() throws IOException {
        File folderVersion = new File(FOLDER_GENERATED_FILE, actualMessage.getVersion());
        File folderMessage = new File(folderVersion, "message");
        File folderType = new File(folderMessage, actualMessage.getType());

        if (!folderType.exists()) {
            folderType.mkdirs();
        }
        saveFile(folderType);
    }

    private void saveFile(File parentFile) throws IOException {
        String text = getMessageClass();
        try (FileOutputStream fStream = new FileOutputStream(new File(parentFile, getClassName(actualMessage.getType()) + ".java")); DataOutputStream dataOutputStreama = new DataOutputStream(fStream)) {
            dataOutputStreama.write(text.getBytes());
        }
        //System.out.println(text);
    }

    private String getMessageClass() {
        String groupClass = getMessageClassPrefix();
        groupClass = groupClass.replace("#template_fields#\r\n", getClassMessageFields());
        return groupClass;
    }

    private String getMessageClassPrefix() {
        String templateClass = getFile("template_class_message");
        templateClass = templateClass.replace("#package#", "package org.edifree.edifact.main.version." + actualMessage.getVersion() + ".message." + actualMessage.getType());
        templateClass = templateClass.replace("#import_segment#", "org.edifree.edifact.main.version." + actualMessage.getVersion() + ".segment.*");
        templateClass = templateClass.replace("#class_name#", getClassName(actualMessage.getType()));
        templateClass = templateClass.replace("#message_name#", actualMessage.getType());
        //templateClass=templateClass.replace("#message_description#",message.getType());
        return templateClass;
    }

    private String getClassMessageFields() {
        StringBuilder sb = new StringBuilder();

        HashMap<String,Counter> hashMap = new LinkedHashMap<>();
        for (Object object : actualMessage.getList()) {
            addToHashMap(hashMap,(MapInterface) object);
        }
        for (Object object : actualMessage.getList()) {
            if (object instanceof Segment) {
                Segment segment = (Segment) object;
                sb.append(getSegment(segment,getVariableNumber(hashMap,(MapInterface) object)));
            } else if (object instanceof Group) {
                Group group = (Group) object;
                sb.append(getGroup(group,getVariableNumber(hashMap,(MapInterface) object)));
            }
        }
        return sb.toString();
    }


    public void createGroupFile(Group group) throws IOException {
        File folderVersion = new File(FOLDER_GENERATED_FILE, actualMessage.getVersion());
        File folderMessage = new File(folderVersion, "message");
        File folderType = new File(folderMessage, actualMessage.getType());

        if (!folderType.exists()) {
            folderType.mkdirs();
        }
        saveFile(folderType, group);
    }

    private void saveFile(File parentFile, Group group) throws IOException {
        String text = getGroupClass(group);
        try (FileOutputStream fStream = new FileOutputStream(new File(parentFile, getClassName(group.getName()) + ".java")); DataOutputStream dataOutputStreama = new DataOutputStream(fStream)) {
            dataOutputStreama.write(text.getBytes());
        }
        //System.out.println(text);
    }

    private String getGroupClass(Group group) {
        String groupClass = getGroupClassPrefix(group);
        groupClass = groupClass.replace("#template_fields#\r\n", getClassGroupFields(group));
        return groupClass;
    }

    private String getGroupClassPrefix(Group group) {
        String templateClass = getFile("template_class_group");
        templateClass = templateClass.replace("#package#", "package org.edifree.edifact.main.version." + actualMessage.getVersion() + ".message." + actualMessage.getType());
        templateClass = templateClass.replace("#import_segment#", "org.edifree.edifact.main.version." + actualMessage.getVersion() + ".segment.*");
        templateClass = templateClass.replace("#class_name#", getClassName(group.getName()));
        templateClass = templateClass.replace("#field_id#", group.getId());
        templateClass = templateClass.replace("#field_name#", group.getName());
        templateClass = templateClass.replace("#field_description#", group.getDescription());
        return templateClass;
    }

    private String getClassGroupFields(Group groupField){
        StringBuilder sb = new StringBuilder();
        HashMap<String,Counter> hashMap = new LinkedHashMap<>();

        for (Object object : groupField.getList()) {
            addToHashMap(hashMap,(MapInterface) object);
        }
        for (Object object : groupField.getList()) {
            if (object instanceof Segment) {
                Segment segment = (Segment) object;
                sb.append(getSegment(segment,getVariableNumber(hashMap,(MapInterface) object)));
            } else if (object instanceof Group) {
                Group group = (Group) object;
                sb.append(getGroup(group,getVariableNumber(hashMap,(MapInterface) object)));
            }
        }
        return sb.toString();
    }

    private int getVariableNumber(HashMap<String, Counter> hashMap,MapInterface object){
        for (String key : hashMap.keySet()) {
            if (key.equals(object.getId())) {
                return hashMap.get(key).increaseIsCounter();
            }
        }
        return 0;
    }


    private void addToHashMap(HashMap<String, Counter> hashMap, MapInterface object) {
        if (hashMap.get(object.getId()) == null) {
            hashMap.put(object.getId(), new Counter());
            return;
        }
        for (String key : hashMap.keySet()) {
            if (key.equals(object.getId())) {
                hashMap.get(key).increaseShouldBeCounter();
                return;
            }
        }
    }

    public void createSegmentFile(Segment segment) throws IOException {
        File folderVersion = new File(FOLDER_GENERATED_FILE, actualMessage.getVersion());
        File folderType = new File(folderVersion, "segment");

        if (!folderType.exists()) {
            folderType.mkdirs();
        }
        saveFile(folderType, segment);
    }

    private void saveFile(File parentFolder, Segment segment) throws IOException {
        String text = getSegmentClass(segment);
        try (FileOutputStream fStream = new FileOutputStream(new File(parentFolder, getClassName(segment.getName()) + ".java")); DataOutputStream dataOutputStreama = new DataOutputStream(fStream)) {
            dataOutputStreama.write(text.getBytes());
        }
        //System.out.println(text);
    }


    private String getSegmentClass(Segment segment) {
        String segmentClass = getSegmentClassPrefix(segment);
        segmentClass = segmentClass.replace("#template_fields#\r\n", getClassSegmentField(segment));
        return segmentClass;
    }


    private String getSegmentClassPrefix(Segment segment) {
        String templateClass = getFile("template_class_segment");
        templateClass = templateClass.replace("#package#", "package org.edifree.edifact.main.version." + actualMessage.getVersion() + ".segment");
        templateClass = templateClass.replace("#import_field#", "org.edifree.edifact.main.version." + actualMessage.getVersion() + ".field.*");
        templateClass = templateClass.replace("#class_name#", getClassName(segment.getName()));
        templateClass = templateClass.replace("#field_id#", segment.getId());
        templateClass = templateClass.replace("#field_name#", segment.getName());
        templateClass = templateClass.replace("#field_description#", segment.getDescription());
        templateClass = templateClass.replace("#tag_name#", segment.getId());
        return templateClass;
    }

    private String getClassSegmentField(Segment segment) {
        StringBuilder sb = new StringBuilder();
        HashMap<String,Counter> hashMap = new LinkedHashMap<>();

        for (Object object : segment.getList()) {
            addToHashMap(hashMap,(MapInterface) object);
        }
        for (Object object : segment.getList()) {
            if (object instanceof Field) {
                Field field = (Field) object;
                sb.append(getField(field,getVariableNumber(hashMap,(MapInterface) object)));
            } else if (object instanceof Component) {
                Component component = (Component) object;
                sb.append(getComponent(component,getVariableNumber(hashMap,(MapInterface) object)));
            }
        }
        return sb.toString();
    }


    public void createFieldFile(Field field) throws IOException {
        File folderVersion = new File(FOLDER_GENERATED_FILE, actualMessage.getVersion());
        File folderField = new File(folderVersion, "field");

        if (!folderField.exists()) {
            folderField.mkdirs();
        }
        saveFile(folderField, field);
    }

    private void saveFile(File folderField, Field field) throws IOException {
        String text = getFieldClass(field);
        try (FileOutputStream fStream = new FileOutputStream(new File(folderField, getClassName(field.getName()) + ".java")); DataOutputStream dataOutputStreama = new DataOutputStream(fStream)) {
            dataOutputStreama.write(text.getBytes());
        }
        //System.out.println(text);
    }

    private String getFieldClass(Field field){
        String fieldClass = getFieldClassPrefix(field);
        fieldClass = fieldClass.replace("#template_fields#\r\n", getClassFieldComponents(field));
        return fieldClass;
    }

    private String getFieldClassPrefix(Field field) {
        String templateClass = getFile("template_class_field");
        templateClass = templateClass.replace("#package#", "package org.edifree.edifact.main.version." + actualMessage.getVersion() + ".field");
        templateClass = templateClass.replace("#class_name#", getClassName(field.getName()));
        templateClass = templateClass.replace("#field_id#", field.getId());
        templateClass = templateClass.replace("#field_name#", field.getName());
        templateClass = templateClass.replace("#field_description#", field.getDescription());
        //templateClass=templateClass.replace("#import_other#\r\n","");
        return templateClass;
    }

    private String getClassFieldComponents(Field field){
        StringBuilder sb = new StringBuilder();

        HashMap<String,Counter> hashMap = new LinkedHashMap<>();
        for (Component component : field.getList()) {
            addToHashMap(hashMap,component);
        }
        for (Component component : field.getList()) {
            sb.append(getComponent(component,getVariableNumber(hashMap,component)));

        }
        return sb.toString();
    }

    private String getComponent(Component component,int variableNumber) {
        String templateClassField = getFile("template_field_in_class");
        if (component.getMinLength() == component.getMaxLength()) {
            templateClassField = templateClassField.replaceAll("#length#", String.valueOf(component.getMaxLength()));
        } else {
            templateClassField = templateClassField.replaceAll("#length#", String.valueOf(component.getMinLength()) + "-" + String.valueOf(component.getMaxLength()));
        }
        templateClassField = templateClassField.replaceAll("@MaxChild\\(#max_child#\\)\r\n", "");
        if (component.isMandatory()) {
            templateClassField = templateClassField.replaceAll("#mandatory#", "@Mandatory");
        } else {
            templateClassField = templateClassField.replaceAll("#mandatory#\r\n", "");
        }
        templateClassField = templateClassField.replaceAll("#type#", component.getType());
        templateClassField = templateClassField.replaceAll("#name#", getVariableName(component.getName(), variableNumber));
        return templateClassField;
    }

    private String getField(Field field,int variableNumber) {
        String templateClassField = getFile("template_field_in_class");
        templateClassField = templateClassField.replaceAll("@Length\\(\"#length#\"\\)\r\n", "");
        templateClassField = templateClassField.replaceAll("@MaxChild\\(#max_child#\\)\r\n", "");
        if (field.isMandatory()) {
            templateClassField = templateClassField.replaceAll("#mandatory#", "@Mandatory");
        } else {
            templateClassField = templateClassField.replaceAll("#mandatory#\r\n", "");
        }
        templateClassField = templateClassField.replaceAll("#type#", getClassName(field.getName()));
        templateClassField = templateClassField.replaceAll("#name#", getVariableName(field.getName(), variableNumber));
        return templateClassField;
    }

    private String getSegment(Segment segment,int variableNumber) {
        String templateClassField;
        if (segment.getMaxChild() > 1) {
            templateClassField = getFile("template_field_list_in_class");
            templateClassField = templateClassField.replaceAll("#max_child#", String.valueOf(segment.getMaxChild()));
        } else {
            templateClassField = getFile("template_field_in_class");
            templateClassField = templateClassField.replaceAll("@MaxChild\\(#max_child#\\)\r\n", "");
        }
        templateClassField = templateClassField.replaceAll("@Length\\(\"#length#\"\\)\r\n", "");

        if (segment.isMandatory()) {
            templateClassField = templateClassField.replaceAll("#mandatory#", "@Mandatory");
        } else {
            templateClassField = templateClassField.replaceAll("#mandatory#\r\n", "");
        }
        templateClassField = templateClassField.replaceAll("#type#", getClassName(segment.getName()));
        templateClassField = templateClassField.replaceAll("#name#", getVariableName(segment.getName(), variableNumber));
        return templateClassField;
    }

    private String getGroup(Group group, int variableNumber) {
        String templateClassField;
        if (group.getMaxChild() > 1) {
            templateClassField = getFile("template_field_list_in_class");
            templateClassField = templateClassField.replaceAll("#max_child#", String.valueOf(group.getMaxChild()));
        } else {
            templateClassField = getFile("template_field_in_class");
            templateClassField = templateClassField.replaceAll("@MaxChild\\(#max_child#\\)\r\n", "");
        }
        templateClassField = templateClassField.replaceAll("@Length\\(\"#length#\"\\)\r\n", "");
        if (group.isMandatory()) {
            templateClassField = templateClassField.replaceAll("#mandatory#", "@Mandatory");
        } else {
            templateClassField = templateClassField.replaceAll("#mandatory#\r\n", "");
        }
        templateClassField = templateClassField.replaceAll("#type#", getClassName(group.getName()));
        templateClassField = templateClassField.replaceAll("#name#", getVariableName(group.getName(), variableNumber));
        return templateClassField;
    }

    private String getVariableName(String componentName, int number) {
        componentName = componentName.replaceAll("/", " ");
        String[] split = componentName.replaceAll("[^A-Za-z0-9 ]", "").trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s : split) {
            s = s.replaceAll("\\s+", "");
            if (s.isEmpty()) {
                continue;
            }
            if (sb.length() == 0) {
                sb.append(s.substring(0, 1).toLowerCase());
            } else {
                sb.append(s.substring(0, 1).toUpperCase());
            }
            sb.append(s.substring(1, s.length()).toLowerCase());
        }
        if (number != 0) {
            sb.append(number);
        }
        return getVariableWithoutSpecialWords(sb);
    }

    private String getVariableWithoutSpecialWords(StringBuilder sb) {
        if (sb.toString().contains("segmentgroup")) {
            return sb.toString().replaceAll("segmentgroup", "segmentGroup");
        } else if (sb.toString().equals("package")) {
            return "packageObject";
        }
        return sb.toString();
    }

    private String getClassName(String name) {
        name = name.replaceAll("/", " ");
        String[] split = name.replaceAll("[^A-Za-z0-9 ]", "").trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s : split) {
            s = s.replaceAll("\\s+", "");
            if (s.isEmpty()) {
                continue;
            }
            sb.append(s.substring(0, 1).toUpperCase());
            sb.append(s.substring(1, s.length()).toLowerCase());
        }
        return getClassWithoutSpecialWords(sb);
    }

    private String getClassWithoutSpecialWords(StringBuilder sb) {
        if (sb.toString().contains("Segmentgroup")) {
            return sb.toString().replaceAll("Segmentgroup", "SegmentGroup");
        } else if (sb.toString().equals("Package")) {
            return "PackageObject";
        }
        return sb.toString();
    }

    public String getFile(String fileName) {
        String result = "";

        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            throw new NullPointerException("ClassLoader is NULL");
        }
        try {
            result = IOUtils.toString(classLoader.getResourceAsStream(fileName), Charset.forName("utf-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;

    }


}
