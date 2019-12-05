package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C241
 * @name DUTY/TAX/FEE TYPE
 * @description Code and/or name identifying duty, tax or fee.
 */

@Data
public class DutyTaxFeeType {

@Length("0-3")
private String dutyTaxFeeTypeCoded;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-35")
private String dutyTaxFeeType;

}
