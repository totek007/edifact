/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.edifree.edifact.main.syntax.v3_0;

import org.edifree.edifact.main.Edifact;
import org.edifree.edifact.main.all.annotations.Mandatory;
import org.edifree.edifact.main.syntax.v3_0.una.InterchangeDelimiters;
import org.edifree.edifact.main.syntax.v3_0.unb.InterchangeHeader;
import org.edifree.edifact.main.syntax.v3_0.unz.InterchangeTrailer;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author Rafal Paszkowski
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class Edifact30 extends Edifact{
    
    private InterchangeDelimiters interchangeDelimiters;
    
    @Mandatory
    private InterchangeHeader interchangeHeader;
    
    @Mandatory
    private Messages messages;

    @Mandatory
    private InterchangeTrailer interchangeTrailer;

}
