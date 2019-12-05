package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C955
 * @name ATTRIBUTE TYPE
 * @description Identification of the type of attribute.
 */

@Data
public class AttributeType {

@Mandatory
@Length("0-3")
private String attributeTypeCoded;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

}
