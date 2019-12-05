package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C536
 * @name CONTRACT AND CARRIAGE CONDITION
 * @description To identify a contract and carriage condition.
 */

@Data
public class ContractAndCarriageCondition {

@Mandatory
@Length("0-3")
private String contractAndCarriageConditionCoded;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

}
