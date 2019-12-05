package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C110
 * @name PAYMENT TERMS
 * @description Terms of payment code from a specified source.
 */

@Data
public class PaymentTerms {

@Mandatory
@Length("0-17")
private String termsOfPaymentIdentification;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-35")
private String termsOfPayment1;

@Length("0-35")
private String termsOfPayment2;

}
