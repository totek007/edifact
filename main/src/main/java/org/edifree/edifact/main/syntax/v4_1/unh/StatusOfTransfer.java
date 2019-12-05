/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.edifree.edifact.main.syntax.v4_1.unh;

import org.edifree.edifact.main.all.annotations.Length;
import org.edifree.edifact.main.all.annotations.Mandatory;

import org.edifree.edifact.main.all.custom_object.Decimal;
import lombok.Data;

/**
 *
 * @author Rafal Paszkowski
 */
@Data
public class StatusOfTransfer {
    
    @Length("0-2")
    @Mandatory
    private Decimal sequenceOfTransfers;
    
    @Length("1")
    @Mandatory
    private String firstAndLastTransfer;

}
