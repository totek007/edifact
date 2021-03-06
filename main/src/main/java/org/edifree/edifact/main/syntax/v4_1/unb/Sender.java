/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.edifree.edifact.main.syntax.v4_1.unb;

import org.edifree.edifact.main.all.annotations.Length;
import org.edifree.edifact.main.all.annotations.Mandatory;
import lombok.Data;

/**
 *
 * @author Rafal Paszkowski
 */
@Data
public class Sender {
    
    @Length("0-35")
    @Mandatory
    private String id;
    
    @Length("0-4")
    private String identificationCodeQualifier;
    
    @Length("0-35")
    private String internalIdentification;
    
    @Length("0-35")
    private String internalSubIdentification;
 
}
