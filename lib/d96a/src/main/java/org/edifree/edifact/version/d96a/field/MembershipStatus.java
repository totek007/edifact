package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C944
 * @name MEMBERSHIP STATUS
 * @description Code and/or description of membership status.
 */

@Data
public class MembershipStatus {

@Length("0-3")
private String membershipStatusCoded;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-35")
private String membershipStatus;

}
