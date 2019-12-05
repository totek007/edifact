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
public class ScenarioIdentification {
    @Length("0-14")
    @Mandatory
    public String id;
    
    @Length("0-3")
    public String versionNumber;
    
    @Length("0-3")
    public String releaseNumber;
    
    @Length("0-3")
    public String controllingAgencyCoded;
}
