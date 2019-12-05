/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.edifree.edifact.main.syntax.v3_0.unh;

import org.edifree.edifact.main.all.annotations.Length;
import org.edifree.edifact.main.all.annotations.Mandatory;
import org.edifree.edifact.main.all.annotations.TagName;
import lombok.Data;

/**
 *
 * @author Rafal Paszkowski
 */

@TagName("UNH")
@Data
public class MessageHeader {
    
    @Length("0-14")
    @Mandatory
    private String messageReferenceNumber;
    
    @Mandatory
    private MessageIdentifier messageIdentifier;
    
    @Length("0-35")
    private String commonAccessReference;
    
    private StatusOfTransfer statusOfTransfer;

    private MessageSubsetIdentification messageSubsetIdentification;

    private MessageImplementationGuidelineId messageImplementationGuidelineId;

    private ScenarioIdentification scenarioIdentification;
}
