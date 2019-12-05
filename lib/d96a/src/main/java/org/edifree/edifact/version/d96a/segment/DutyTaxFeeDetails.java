package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id TAX
 * @name DUTY/TAX/FEE DETAILS
 * @description A segment specifying the tax type, category, and rate, or exemption, related to the allowance or charge.
 */

@TagName("TAX")
@Data
public class DutyTaxFeeDetails {

@Mandatory
@Length("0-3")
private String dutyTaxFeeFunctionQualifier;

private DutyTaxFeeType dutyTaxFeeType;

private DutyTaxFeeAccountDetail dutyTaxFeeAccountDetail;

@Length("0-15")
private String dutyTaxFeeAssessmentBasis;

private DutyTaxFeeDetail dutyTaxFeeDetail;

@Length("0-3")
private String dutyTaxFeeCategoryCoded;

@Length("0-20")
private String partyTaxIdentificationNumber;

}
