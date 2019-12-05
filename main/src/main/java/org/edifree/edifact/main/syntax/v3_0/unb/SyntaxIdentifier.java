/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.edifree.edifact.main.syntax.v3_0.unb;

import org.edifree.edifact.main.all.annotations.Length;
import org.edifree.edifact.main.all.annotations.Mandatory;
import org.edifree.edifact.main.all.custom_object.Decimal;
import lombok.Data;

/**
 *
 * @author Rafal Paszkowski
 */

@Data
public class SyntaxIdentifier {
    @Length("4")
    @Mandatory
    private String id;
    
    @Length("1")
    @Mandatory
    private Decimal versionNumber;
    
}
