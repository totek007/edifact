/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.edifree.edifact.main.all.parser;

import org.edifree.edifact.main.Edifact;
import org.edifree.edifact.main.all.annotations.Length;
import org.edifree.edifact.main.all.annotations.MaxChild;
import org.edifree.edifact.main.all.exception.EdifactValidateException;
import org.edifree.edifact.main.all.custom_object.EdifactList;
import org.edifree.edifact.main.all.annotations.Mandatory;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.List;

import static org.edifree.edifact.main.all.custom_object.ObjectHelper.*;

/**
 *
 * @author Rafal Paszkowski
 */
public class EdifactValidator {

    public static void check(Edifact edifact) throws EdifactValidateException {
        try{
            check(edifact,true);
        }catch (IllegalAccessException ex) {
            throw new EdifactValidateException(ex);
        }
    }

    private static void check(Object parentObject, boolean parentIsMandatory) throws EdifactValidateException, IllegalAccessException {

        for (Field field : parentObject.getClass().getDeclaredFields()) {
            field.setAccessible(true);
//            if(field.getType().isAnnotationPresent(TagName.class)){
//                if(field.getType().getAnnotation(TagName.class).value().equals("LIN")){
//                    System.out.println("!!!");
//                }
//
//            }

            if (field.isAnnotationPresent(Mandatory.class)) {
                if (Collection.class.isAssignableFrom(field.getType())) {
                    List list = (List) field.get(parentObject);
                    if (list == null || list.isEmpty()) {
                        if (parentIsMandatory) {
                            throw getException(field,parentObject);
                        }
                        break;
                    } else {
                        isCorrectForList(field, list, true);
                        continue;
                    }
                } else {
                    Object value = field.get(parentObject);
                    //System.out.println(field.getType().getSimpleName());
                    if (value == null) {
                        if(!objectIsEmpty(parentObject)){
                            throw getException(field,parentObject);
                        }
                    } else {
                        if (objectIsSimpleType(field)) {
                            if(String.valueOf(value).isEmpty() && parentIsMandatory){
                                throw getException(field,parentObject);
                            }else{
                                checkCorrectLength(field,value,parentObject);
                            }
                            break;
                        } else if (!objectIsSimpleType(field)) {
                            check(value, true);
                            continue;
                        } else {
                            continue;
                        }
                    }
                }
            }

            if (Collection.class.isAssignableFrom(field.getType())) {
                List list = (List) field.get(parentObject);
                if (list != null && !list.isEmpty()) {
                    isCorrectForList(field,list, false);
                }
            } else {
                Object value = field.get(parentObject);
                if (value != null){
                    if (!objectIsSimpleType(field)) {
                        check(value, false);
                    }else{
                        checkCorrectLength(field,value,parentObject);
                    }
                }
            }
        }
    }

    private static void checkCorrectLength(Field field,Object fieldValue, Object parentObject) throws EdifactValidateException {
        if (field.isAnnotationPresent(Length.class)) {
            String value = field.getAnnotation(Length.class).value();
            if(value.contains("-")){
                String[] values = value.split("-");
                if(fieldValue.toString().length()<Integer.parseInt(values[0]) || fieldValue.toString().length()>Integer.parseInt(values[1])){
                    throw getExceptionLength(field,fieldValue,parentObject);
                }
            }else{
                //System.out.println(Integer.valueOf(value).intValue());
                //System.out.println(fieldValue.toString().length());
                if(Integer.valueOf(value).intValue()!=fieldValue.toString().length()){
                    throw getExceptionLength(field,fieldValue,parentObject);
                }
            }
        }
    }
    private static void isCorrectForList(Field field,Object parentObject, boolean parentIsMandatory) throws EdifactValidateException, IllegalAccessException {
        checkCorrectnessOfListLength(field,parentObject);

        List<Object> list = (EdifactList)(parentObject);
        for (Object object : list) {
            check(object, parentIsMandatory);
        }
    }

    private static void checkCorrectnessOfListLength(Field field,Object parentObject) throws EdifactValidateException, IllegalAccessException {
        if(!field.isAnnotationPresent(MaxChild.class)){
            throw getExceptionListNoMaxChildAnnotation(field,parentObject);
        }
        if(getMaxChildList(field)<getListLength(parentObject)){
            throw getExceptionListToMoreElements(field, parentObject);
        }
    }

    private static int getMaxChildList(Field field){
        return field.getAnnotation(MaxChild.class).value();
    }

    private static int getListLength(Object parentObject){
        List<Object> list = (EdifactList)(parentObject);
        if(list==null || list.isEmpty()){
            return 0;
        }else{
            return list.size();
        }
    }

    private static EdifactValidateException getExceptionListToMoreElements(Field field, Object parentObject) {
        return new EdifactValidateException("Field '"+field.getName()+"' has too more child ("+getListLength(parentObject)+").Max child is "+getMaxChildList(field)+".Parent object:"+parentObject.getClass().getName());
    }

    private static EdifactValidateException getExceptionListNoMaxChildAnnotation(Field field, Object parentObject){
        return new EdifactValidateException("Field '"+field.getName()+"' hasn't MaxChild annotation. Parent object:"+parentObject.getClass().getName());
    }

    private static EdifactValidateException getExceptionLength(Field field,Object fieldValue, Object parentObject){
        return new EdifactValidateException("Field '"+field.getName()+"' has wrong length ("+fieldValue.toString().length()+"). Lenght should be equal "+field.getAnnotation(Length.class).value()+".Parent object:"+parentObject.getClass().getName());
    }

    private static EdifactValidateException getException(Field field,Object parentObject){
        return new EdifactValidateException("Field '"+field.getName()+"' is mandatory. Parent object:"+parentObject.getClass().getName());
    }



}
