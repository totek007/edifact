package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id PAT
 * @name PAYMENT TERMS BASIS
 * @description A segment providing payment term related to the preceding PAI segment.
 */

@TagName("PAT")
@Data
public class PaymentTermsBasis {

@Mandatory
@Length("0-3")
private String paymentTermsTypeQualifier;

private PaymentTerms paymentTerms;

private TermsTimeInformation termsTimeInformation;

}
