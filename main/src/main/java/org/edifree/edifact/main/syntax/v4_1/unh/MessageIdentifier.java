/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.edifree.edifact.main.syntax.v4_1.unh;


import org.edifree.edifact.main.all.annotations.Length;
import org.edifree.edifact.main.all.annotations.Mandatory;
import lombok.Data;

/**
 *
 * @author Rafal Paszkowski
 */
@Data
public class MessageIdentifier {
    
    @Length("0-6")
    @Mandatory
    private String type;
    
    @Length("0-3")
    @Mandatory
    private String versionNumber;
    
    @Length("0-3")
    @Mandatory
    private String releaseNumber;
    
    @Length("0-3")
    @Mandatory
    private String controllingAgencyCode;
    
    @Length("0-6")
    private String associationAssignedCode;
    
    @Length("0-6")
    private String directoryVersionNumber;
    
    @Length("0-6")
    private String subFunctionId;
    
}
