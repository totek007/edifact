package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id CPI
 * @name CHARGE PAYMENT INSTRUCTIONS
 * @description A segment to identify methods of payment for transport charges.
 */

@TagName("CPI")
@Data
public class ChargePaymentInstructions {

private ChargeCategory chargeCategory;

private MethodOfPayment methodOfPayment;

@Length("0-3")
private String prepaidCollectIndicatorCoded;

}
