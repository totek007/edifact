/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.edifree.edifact.main.syntax.v4_1.unb;

import org.edifree.edifact.main.all.annotations.Length;
import org.edifree.edifact.main.all.annotations.Mandatory;

import org.edifree.edifact.main.all.custom_object.Decimal;
import lombok.Data;

/**
 *
 * @author Rafal Paszkowski
 */

@Data
public class DateAndTime {
    
    @Length("8")
    @Mandatory
    private Decimal date;
    
    @Length("4")
    @Mandatory
    private Decimal time;
}
