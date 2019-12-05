/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.edifree.edifact.main.all.parser;

import org.edifree.edifact.main.Edifact;
import org.edifree.edifact.main.all.custom_object.Setting;
import org.edifree.edifact.main.all.annotations.Mandatory;
import org.edifree.edifact.main.all.annotations.TagName;
import org.edifree.edifact.main.all.custom_object.Decimal;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author Rafal Paszkowski
 */
public class EdifactCreator {

    private final Setting setting;
    private final String content;

    public EdifactCreator(Edifact edifact) throws Exception {
        this.setting = Setting.getSetting(edifact);
        this.content = createContent(edifact);
    }

    private String createContent(Object object) throws Exception {
        StringBuilder sb = new StringBuilder();
        createEdifactText(object, sb);
        return sb.toString();
    }

    private void createEdifactText(Object parentObject, StringBuilder sb) throws Exception {

        for (Field field : parentObject.getClass().getDeclaredFields()) {
            field.setAccessible(true);

            if (Collection.class.isAssignableFrom(field.getType())) {
                List get = (List) field.get(parentObject);
                if (get != null) {
                    for (Object object : get) {
                        if (object.getClass().isAnnotationPresent(TagName.class)) {
                            sb.append(getLine(object));
                        } else {
                            createEdifactText(object, sb);
                        }
                    }
                }
            } else {
                Object value = field.get(parentObject);
                if (value == null) {
                    continue;
                }
                if (field.getType().isAnnotationPresent(TagName.class)) {
                    sb.append(getLine(value, field));
                } else {
                    createEdifactText(value, sb);
                }
            }

        }
    }

    private String getLine(Object object) throws Exception {
        if(object.getClass().getAnnotation(TagName.class).value().equals("UNA")){
            return "UNA"+setting.getNextComponentSign()+setting.getNextFieldSign()+setting.getDecimalSign()+setting.getNextSpecialSign()+setting.getNextFutureSign()+setting.getNextSegmentSign()+"\n";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(object.getClass().getAnnotation(TagName.class).value());
        sb.append(getFieldList(object));
        sb.append(setting.getNextSegmentSign()).append("\n");
        return sb.toString();
    }
    
    private String getLine(Object object, Field field) throws Exception {
        if(object.getClass().getAnnotation(TagName.class).value().equals("UNA")){
            return "UNA"+setting.getNextComponentSign()+setting.getNextFieldSign()+setting.getDecimalSign()+setting.getNextSpecialSign()+setting.getNextFutureSign()+setting.getNextSegmentSign()+"\n";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getTagName(field));
        sb.append(getFieldList(object));
        sb.append(setting.getNextSegmentSign()).append("\n");
        return sb.toString();
    }
    
    private String getTagName(Field field){
        return field.getType().getAnnotation(TagName.class).value();
    }

    private String getFieldList(Object parentObject) throws Exception {

        StringBuilder sb = new StringBuilder();
        Field[] declaredFields = parentObject.getClass().getDeclaredFields();
        for (int i = declaredFields.length - 1; i >= 0; i--) {
            Field field = declaredFields[i];
            field.setAccessible(true);
            String componentList = getComponentList(field.get(parentObject));
            if (componentList.isEmpty()) {
                if (sb.length() > 0) {
                    sb.insert(0, setting.getNextFieldSign());
                }
                if (field.getType().isAnnotationPresent(Mandatory.class)) {
                    sb.insert(0, setting.getNextFieldSign());
                }
            } else {
                sb.insert(0, (setting.getNextFieldSign() + componentList));
            }
        }
        return sb.toString();
    }

    private String getComponentList(Object parentObject) throws Exception {
        StringBuilder sb = new StringBuilder();
        if (parentObject == null) {
            return "";
        }

        if (itIsSimpleType(parentObject)) {
            if (parentObject instanceof String) {
                sb.append(parentObject);
            }else if (parentObject instanceof Decimal) {
                sb.append((parentObject).toString());
            }
            return sb.toString();
        }

        Field[] declaredFields = parentObject.getClass().getDeclaredFields();

        for (int i = declaredFields.length - 1; i >= 0; i--) {
            Field field = declaredFields[i];
            field.setAccessible(true);
            String component = getComponent(field.get(parentObject), field);
            if (component.isEmpty()) {
                if (sb.length() > 0) {
                    if(i!=0){
                        sb.insert(0, setting.getNextComponentSign());
                    }
                }
            } else {
                if (i == 0) {
                    sb.insert(0, component);
                } else {
                    sb.insert(0, setting.getNextComponentSign() + component);
                }
            }
        }
        return sb.toString();
    }

    private String getComponent(Object value, Field field) throws Exception {
        if (value == null) {
            if (field.getType().isAnnotationPresent(Mandatory.class)) {
                return String.valueOf(setting.getNextComponentSign());
            }
            return "";
        }
        if (value instanceof String) {
            return replaceSpecialChars((String) value);
        } else if (value instanceof Decimal) {
            return value.toString();
        }
        throw new Exception("Fatal error. Unknown field type.");
    }

    private boolean itIsSimpleType(Object parentObject) {
        return parentObject instanceof String || parentObject instanceof Decimal;
    }

    private String replaceSpecialChars(String text) {
        StringBuilder sb = new StringBuilder();

        for (char c : text.toCharArray()) {
            if (isNextSpecialChar(c)){
                sb.append(setting.getNextSpecialSign()); 
            }
            sb.append(c);
        }
        return sb.toString();
    }
    
    private boolean isNextSpecialChar(char c) {
        if(setting.getNextFutureSign()==' '){
            return c == setting.getNextComponentSign() || c== setting.getNextFieldSign() || c==setting.getNextSegmentSign();
        }else{
            return c == setting.getNextComponentSign() || c== setting.getNextFieldSign() || c==setting.getNextSegmentSign() || c==setting.getNextFutureSign();
        }
    }

    public Setting getSetting() {
        return setting;
    }

    public String getContent() {
        return content;
    }

}
