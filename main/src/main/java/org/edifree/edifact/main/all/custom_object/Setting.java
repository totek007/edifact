/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.edifree.edifact.main.all.custom_object;

import org.edifree.edifact.main.Edifact;
import org.edifree.edifact.main.syntax.v3_0.Edifact30;
import org.edifree.edifact.main.syntax.v4_1.Edifact41;

/**
 *
 * @author Rafal Paszkowski
 */
public class Setting {
    private char nextComponentSign;  
    private char nextFieldSign;        
    private char decimalSign;           
    private char nextSpecialSign;
    private char nextFutureSign;
    private char nextSegmentSign;       
    private String ignoreCRLF;       
    
    public static Setting getDefault(){
        Setting setting=new Setting();
        setting.nextComponentSign=':';
        setting.nextFieldSign='+';
        setting.decimalSign='.';
        setting.nextSpecialSign='?';
        setting.nextFutureSign='*';
        setting.nextSegmentSign='\'';
        setting.ignoreCRLF=null;
        return setting;
    }
    
    public static Setting getSetting(String text){
        int indexUnaTag =text.indexOf("UNA");
        if(indexUnaTag<0){
            return getDefault();
        }
        Setting setting=new Setting();
        setting.nextComponentSign=text.substring(indexUnaTag+3, indexUnaTag+4).charAt(0);
        setting.nextFieldSign=text.substring(indexUnaTag+4, indexUnaTag+5).charAt(0);
        setting.decimalSign=text.substring(indexUnaTag+5, indexUnaTag+6).charAt(0);
        setting.nextSpecialSign=text.substring(indexUnaTag+6, indexUnaTag+7).charAt(0);
        setting.nextFutureSign=text.substring(indexUnaTag+7, indexUnaTag+8).charAt(0);
        setting.nextSegmentSign=text.substring(indexUnaTag+8, indexUnaTag+9).charAt(0);
        setting.ignoreCRLF=null;
        return setting;
    }
    
    public static Setting getSetting(Edifact edifact){
        //TODO ZABEZPIECZYC SIE JESLI NIE MA ZDEFINIOWANYCH ZNAKOW
        if(edifact instanceof Edifact30){
            Edifact30 edifact30 =(Edifact30) edifact;
            if(edifact30.getInterchangeDelimiters()!=null){
                return getSetting(edifact30);
            }
        }
        if(edifact instanceof Edifact41){
            Edifact41 edifact41 =(Edifact41) edifact;
            if(edifact41.getInterchangeDelimiters()!=null){
                return getSetting(edifact41);
            }
        }
        return getDefault(); 
    }
    
    private static Setting getSetting(Edifact30 edifact){
        return getSetting(edifact.getInterchangeDelimiters().getComponent(), edifact.getInterchangeDelimiters().getField(), edifact.getInterchangeDelimiters().getDecimalSeparator(), edifact.getInterchangeDelimiters().getEscape(), edifact.getInterchangeDelimiters().getFuture(), edifact.getInterchangeDelimiters().getSegment(), edifact.getInterchangeDelimiters().getIgnoreCRLF());
    }
    
    private static Setting getSetting(Edifact41 edifact){
        return getSetting(edifact.getInterchangeDelimiters().getComponent(), edifact.getInterchangeDelimiters().getField(), edifact.getInterchangeDelimiters().getDecimalSeparator(), edifact.getInterchangeDelimiters().getEscape(), edifact.getInterchangeDelimiters().getFuture(), edifact.getInterchangeDelimiters().getSegment(), edifact.getInterchangeDelimiters().getIgnoreCRLF());
    }

    private static Setting getSetting(String component, String field, String decimalSeparator, String escape, String future, String segment, String ignoreCRLF) {
        Setting setting=new Setting();
        setting.nextComponentSign= component.charAt(0);
        setting.nextFieldSign= field.charAt(0);
        setting.decimalSign= decimalSeparator.charAt(0);
        setting.nextSpecialSign= escape.charAt(0);
        setting.nextFutureSign= future.charAt(0);
        setting.nextSegmentSign= segment.charAt(0);
        setting.ignoreCRLF= ignoreCRLF;
        return setting;
    }

    public char getNextComponentSign() {
        return nextComponentSign;
    }

    public char getNextFieldSign() {
        return nextFieldSign;
    }

    public char getDecimalSign() {
        return decimalSign;
    }

    public char getNextSpecialSign() {
        return nextSpecialSign;
    }

    public char getNextSegmentSign() {
        return nextSegmentSign;
    }

    public char getNextFutureSign() {
        return nextFutureSign;
    }

    public String getIgnoreCRLF() {
        return ignoreCRLF;
    }
    
    

    
    
    
    
    
}
