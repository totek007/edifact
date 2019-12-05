/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.edifree.edifact.main.syntax.v3_0.unb;

import org.edifree.edifact.main.all.annotations.Length;
import org.edifree.edifact.main.all.annotations.Mandatory;
import org.edifree.edifact.main.all.annotations.TagName;
import org.edifree.edifact.main.all.custom_object.Decimal;
import lombok.Data;

/**
 *
 * @author Rafal Paszkowski
 */

@TagName("UNB")
@Data
public class InterchangeHeader {
    
    @Mandatory
    private SyntaxIdentifier syntaxIdentifier;
    
    @Mandatory
    private Sender sender;
    
    @Mandatory
    private Recipient recipient;
    
    @Mandatory
    private DateAndTime dateAndTime;
    
    @Mandatory
    @Length("0-14")
    private Decimal controlReference;
    
    private RecipientsReference recipientsReference;
    
    @Length("0-14")
    private String applicationReference;
    
    @Length("1")
    private String priorityCode;
    
    @Length("1")
    private Decimal isAcknowledgementRequest;
    
    @Length("0-35")
    private String communicationsAgreementID;
    
    @Length("1")
    private Decimal testIndicator;

}
