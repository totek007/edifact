package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C550
 * @name REQUIREMENT/CONDITION IDENTIFICATION
 * @description To identify the specific rule/condition requirement.
 */

@Data
public class RequirementConditionIdentification {

@Mandatory
@Length("0-17")
private String requirementConditionIdentification;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-35")
private String requirementOrCondition;

}
