package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C945
 * @name MEMBERSHIP LEVEL
 * @description Identification of a membership level.
 */

@Data
public class MembershipLevel {

@Mandatory
@Length("0-3")
private String membershipLevelQualifier;

@Length("0-9")
private String membershipLevelIdentification;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-35")
private String membershipLevel;

}
