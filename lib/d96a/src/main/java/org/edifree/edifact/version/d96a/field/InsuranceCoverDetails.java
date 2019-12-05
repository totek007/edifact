package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C331
 * @name INSURANCE COVER DETAILS
 * @description To provide the insurance cover details.
 */

@Data
public class InsuranceCoverDetails {

@Length("0-17")
private String insuranceCoverIdentification;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-35")
private String insuranceCover1;

@Length("0-35")
private String insuranceCover2;

}
