/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.edifree.edifact.main.syntax.v3_0.unb;

import org.edifree.edifact.main.all.annotations.Length;
import org.edifree.edifact.main.all.annotations.Mandatory;
import lombok.Data;

/**
 *
 * @author Rafal Paszkowski
 */

@Data
public class Recipient {
    
    @Length("0-35")
    @Mandatory
    private String id;
    
    @Length("0-4")
    private String idPartnerCodeQualifier; //todo ENUM
    
    @Length("0-14")
    private String address;
 
}
