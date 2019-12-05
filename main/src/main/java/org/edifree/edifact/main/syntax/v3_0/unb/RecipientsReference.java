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
public class RecipientsReference {
    
    @Length("0-15")
    @Mandatory
    private String password;
    
    @Length("2")
    private String passwordQualifier;
}
