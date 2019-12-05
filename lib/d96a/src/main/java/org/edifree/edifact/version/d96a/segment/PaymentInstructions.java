package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id PAI
 * @name PAYMENT INSTRUCTIONS
 * @description A segment specifying a method of payment related to the preceding NAD segment.
 */

@TagName("PAI")
@Data
public class PaymentInstructions {

@Mandatory
private PaymentInstructionDetails paymentInstructionDetails;

}
