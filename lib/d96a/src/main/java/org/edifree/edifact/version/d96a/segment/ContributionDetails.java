package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id COT
 * @name CONTRIBUTION DETAILS
 * @description A segment identifying the type of contributions, any investment instruction (e.g. an indication whether multiple investment funds apply), the rate of any additional/ voluntary contributions, and the reason for any change in contributions as required. For periodic review purposes, the contribution type (e.g. member or company paid, additional or voluntary etc.) is mandatory.
 */

@TagName("COT")
@Data
public class ContributionDetails {

@Mandatory
@Length("0-3")
private String contributionQualifier;

private ContributionType contributionType;

private Instruction instruction;

private RateTariffClass rateTariffClass;

private ReasonForChange reasonForChange;

}
