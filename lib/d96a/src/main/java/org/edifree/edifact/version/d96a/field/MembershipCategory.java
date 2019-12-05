package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C942
 * @name MEMBERSHIP CATEGORY
 * @description Identification and/or description of a membership category for a member of a scheme or group.
 */

@Data
public class MembershipCategory {

@Mandatory
@Length("0-4")
private String membershipCategoryIdentification;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-35")
private String membershipCategory;

}
