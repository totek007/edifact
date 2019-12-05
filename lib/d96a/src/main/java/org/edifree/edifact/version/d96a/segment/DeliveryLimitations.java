package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id DLM
 * @name DELIVERY LIMITATIONS
 * @description A segment specifying requested limitations on quoted delivery.
 */

@TagName("DLM")
@Data
public class DeliveryLimitations {

@Length("0-3")
private String backOrderCoded;

private Instruction instruction;

private SpecialServicesIdentification specialServicesIdentification;

@Length("0-3")
private String productServiceSubstitutionCoded;

}
