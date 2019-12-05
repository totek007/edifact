package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C941
 * @name RELATIONSHIP C941
 * @description Identification and/or description of a relationship.
 */

@Data
public class RelationshipC941 {

@Length("0-3")
private String relationshipCoded;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-35")
private String relationship;

}
