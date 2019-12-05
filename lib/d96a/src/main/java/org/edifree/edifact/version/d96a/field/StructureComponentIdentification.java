package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C786
 * @name STRUCTURE COMPONENT IDENTIFICATION
 * @description The identification of a structure component.
 */

@Data
public class StructureComponentIdentification {

@Mandatory
@Length("0-35")
private String structureComponentIdentifier;

@Length("0-3")
private String identityNumberQualifier;

}
