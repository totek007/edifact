package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id REL
 * @name RELATIONSHIP
 * @description A segment providing the relationship between the member and the member's beneficiary.
 */

@TagName("REL")
@Data
public class Relationship {

@Mandatory
@Length("0-3")
private String relationshipQualifier;

private RelationshipC941 relationshipC941;

}
