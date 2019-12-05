package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C231
 * @name METHOD OF PAYMENT
 * @description Code identifying the method of payment.
 */

@Data
public class MethodOfPayment {

@Mandatory
@Length("0-3")
private String transportChargesMethodOfPaymentCoded;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

}
