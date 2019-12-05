package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id CDV
 * @name CODE VALUE DEFINITION
 * @description A segment identifying a particular value of a code.
 */

@TagName("CDV")
@Data
public class CodeValueDefinition {

@Mandatory
@Length("0-35")
private String codeValue;

@Length("0-70")
private String codeName;

@Length("0-3")
private String maintenanceOperationCoded;

}
