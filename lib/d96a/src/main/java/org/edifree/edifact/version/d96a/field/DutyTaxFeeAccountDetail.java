package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C533
 * @name DUTY/TAX/FEE ACCOUNT DETAIL
 * @description Indication of account reference for duties, taxes and/or fees.
 */

@Data
public class DutyTaxFeeAccountDetail {

@Mandatory
@Length("0-6")
private String dutyTaxFeeAccountIdentification;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

}
