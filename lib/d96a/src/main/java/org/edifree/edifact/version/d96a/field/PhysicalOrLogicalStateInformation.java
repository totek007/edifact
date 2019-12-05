package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C564
 * @name PHYSICAL OR LOGICAL STATE INFORMATION
 * @description To give information in coded or clear text form on the physical or logical state.
 */

@Data
public class PhysicalOrLogicalStateInformation {

@Length("0-3")
private String physicalOrLogicalStateCoded;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-35")
private String physicalOrLogicalState;

}
