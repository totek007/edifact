/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.edifree.edifact.main.all.custom_object;

import lombok.extern.slf4j.Slf4j;

/**
 *
 * @author Rafal Paszkowski
 */

@Slf4j
public enum EdifactSyntaxVersion {
    VERSION_30(new String[]{"1","2","3"}),VERSION_41(new String[]{"4","4.1"});

    private String[] ids;

    EdifactSyntaxVersion(String[] ids) {
        this.ids = ids;
    }

    public static EdifactSyntaxVersion create(String edifactSyntaxVersion){

        for(EdifactSyntaxVersion syntaxVersion:EdifactSyntaxVersion.values()){
            for(String id:syntaxVersion.getIds()){
                if(id.equals(edifactSyntaxVersion)){
                    return syntaxVersion;
                }
            }
        }
        log.warn("Unknown syntax version. Trying get default version (4.1)");
        return VERSION_41;
    }

    private String[] getIds() {
        return ids;
    }
}