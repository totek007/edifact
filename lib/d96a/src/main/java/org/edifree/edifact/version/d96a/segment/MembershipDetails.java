package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id MEM
 * @name MEMBERSHIP DETAILS
 * @description A segment specifying relationship between persons within a group.
 */

@TagName("MEM")
@Data
public class MembershipDetails {

@Mandatory
@Length("0-3")
private String membershipQualifier;

private MembershipCategory membershipCategory;

private MembershipStatus membershipStatus;

private MembershipLevel membershipLevel;

private RateTariffClass rateTariffClass;

private ReasonForChange reasonForChange;

}
