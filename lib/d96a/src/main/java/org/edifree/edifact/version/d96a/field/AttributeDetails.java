package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C956
 * @name ATTRIBUTE DETAILS
 * @description Identification of the attribute related to an entity.
 */

@Data
public class AttributeDetails {

@Length("0-3")
private String attributeCoded;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-35")
private String attribute;

}
