/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.edifree.edifact.main.syntax.v4_1.una;

import org.edifree.edifact.main.all.annotations.TagName;
import lombok.Data;

/**
 *
 * @author Rafal Paszkowski
 */

@TagName("UNA")
@Data
public class InterchangeDelimiters {
    
    private String component;
    private String field;
    private String decimalSeparator;
    private String escape;
    private String future;
    private String segment;
    private String ignoreCRLF;

    public InterchangeDelimiters() {
        
    }
    
    public InterchangeDelimiters(String component, String field, String decimalSeparator, String escape, String future, String segment) {
        this.component = component;
        this.field = field;
        this.decimalSeparator = decimalSeparator;
        this.escape = escape;
        this.future = future;
        this.segment = segment;
        this.ignoreCRLF = "false";
    }
    
    public static InterchangeDelimiters initObject(String text){
        int indexUnaTag =text.indexOf("UNA");
        if(indexUnaTag<0){
            return initDefaultObject();
        }
        return new InterchangeDelimiters(
                text.substring(indexUnaTag+3, indexUnaTag+4),
                text.substring(indexUnaTag+4, indexUnaTag+5),
                text.substring(indexUnaTag+5, indexUnaTag+6),
                text.substring(indexUnaTag+6, indexUnaTag+7),
                text.substring(indexUnaTag+7, indexUnaTag+8),
                text.substring(indexUnaTag+8, indexUnaTag+9)
        ); 
    }
    
    public static InterchangeDelimiters initDefaultObject(){
        return new InterchangeDelimiters(":", "+", ".", "?", "*", "'");
    }
    
    

}
