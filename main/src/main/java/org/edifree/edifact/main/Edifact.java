/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.edifree.edifact.main;

import lombok.Data;
import org.edifree.edifact.main.all.custom_object.EdifactSyntaxVersion;
import org.edifree.edifact.main.all.custom_object.EdifactType;
import org.edifree.edifact.main.all.custom_object.EdifactVersion;
import org.edifree.edifact.main.all.exception.EdifactLibraryException;
import org.edifree.edifact.main.all.exception.EdifactValidateException;
import org.edifree.edifact.main.all.parser.EdifactCreator;
import org.edifree.edifact.main.all.parser.EdifactParser;
import org.edifree.edifact.main.all.parser.EdifactValidator;

/**
 *
 * @author Rafal Paszkowski
 */

@Data
public class Edifact {

    protected Edifact() {
    }

    public String createTxt() throws EdifactLibraryException {
        try {
            return new EdifactCreator(this).getContent();
        } catch (Exception ex) {
            throw new EdifactLibraryException("Edifact txt create exception",ex);
        }
    }

    public static Edifact createObject(String text) throws EdifactLibraryException {
        try{
            return getEdifactParser(null, null,null, text).parse();
        }catch(InstantiationException | IllegalAccessException ex){
            throw new EdifactLibraryException("Edifact create exception",ex);
        }
    }
    
    public static Edifact createObject(EdifactSyntaxVersion edifactSyntaxVersion, EdifactVersion edifactVersion, EdifactType edifactType, String text) throws EdifactLibraryException {
        try{
            return getEdifactParser(edifactSyntaxVersion, edifactVersion, edifactType, text).parse();
        }catch(InstantiationException | IllegalAccessException ex){
            throw new EdifactLibraryException("Edifact create exception",ex);
        }
    }

    private static EdifactParser getEdifactParser(EdifactSyntaxVersion edifactSyntaxVersion, EdifactVersion edifactVersion, EdifactType edifactType, String text) throws EdifactLibraryException {
        if(edifactSyntaxVersion!=null && edifactVersion!=null && edifactType!=null){
            return new EdifactParser(edifactSyntaxVersion, edifactVersion, edifactType,text);
        }
        return new EdifactParser(text);
    }

    public void validate() throws EdifactValidateException {
        new EdifactValidator().check(this);
    }



}
