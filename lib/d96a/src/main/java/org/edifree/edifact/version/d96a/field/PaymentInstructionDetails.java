package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C534
 * @name PAYMENT INSTRUCTION DETAILS
 * @description Indication of method of payment employed or to be employed.
 */

@Data
public class PaymentInstructionDetails {

@Length("0-3")
private String paymentConditionsCoded;

@Length("0-3")
private String paymentGuaranteeCoded;

@Length("0-3")
private String paymentMeansCoded;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-3")
private String paymentChannelCoded;

}
