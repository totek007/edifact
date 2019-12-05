package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C243
 * @name DUTY/TAX/FEE DETAIL
 * @description Rate of duty/tax/fee applicable to commodities or of tax applicable to services.
 */

@Data
public class DutyTaxFeeDetail {

@Length("0-7")
private String dutyTaxFeeRateIdentification;

@Length("0-3")
private String codeListQualifier1;

@Length("0-3")
private String codeListResponsibleAgencyCoded1;

@Length("0-17")
private String dutyTaxFeeRate;

@Length("0-12")
private String dutyTaxFeeRateBasisIdentification;

@Length("0-3")
private String codeListQualifier2;

@Length("0-3")
private String codeListResponsibleAgencyCoded2;

}
