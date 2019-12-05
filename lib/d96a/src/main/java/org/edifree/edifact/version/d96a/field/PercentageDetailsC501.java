package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C501
 * @name PERCENTAGE DETAILS C501
 * @description Percentage relating to a specified basis.
 */

@Data
public class PercentageDetailsC501 {

@Mandatory
@Length("0-3")
private String percentageQualifier;

@Length("0-10")
private Decimal percentage;

@Length("0-3")
private String percentageBasisCoded;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

}
