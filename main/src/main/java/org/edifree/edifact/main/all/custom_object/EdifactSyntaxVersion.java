/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.edifree.edifact.main.all.custom_object;

/**
 *
 * @author Rafal Paszkowski
 */
//@Slf4j
public enum EdifactSyntaxVersion {
    VERSION_30("3"),VERSION_41("4");

    String text;

    private EdifactSyntaxVersion(String text) {
        this.text = text;
    }

    public static EdifactSyntaxVersion create(String edifactSyntaxVersion){
        for(EdifactSyntaxVersion e:EdifactSyntaxVersion.values()){
            if(e.text.equals(edifactSyntaxVersion)){
                return e;
            }
        }
        //log. TODO !!!!
        return VERSION_41;
    }

}
