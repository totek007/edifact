package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id CDI
 * @name PHYSICAL OR LOGICAL STATE
 * @description A segment to report the physical state of the identified packages , e.g. missing, damaged.
 */

@TagName("CDI")
@Data
public class PhysicalOrLogicalState {

@Mandatory
@Length("0-3")
private String physicalOrLogicalStateQualifier;

@Mandatory
private PhysicalOrLogicalStateInformation physicalOrLogicalStateInformation;

}
