package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C330
 * @name INSURANCE COVER TYPE
 * @description To provide the insurance cover type.
 */

@Data
public class InsuranceCoverType {

@Mandatory
@Length("0-3")
private String insuranceCoverTypeCoded;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

}
