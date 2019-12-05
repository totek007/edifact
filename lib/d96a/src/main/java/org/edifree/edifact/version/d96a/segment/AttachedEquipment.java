package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id EQA
 * @name ATTACHED EQUIPMENT
 * @description A segment identifying equipment attached to the equipment identified in the EQD segment.
 */

@TagName("EQA")
@Data
public class AttachedEquipment {

@Mandatory
@Length("0-3")
private String equipmentQualifier;

private EquipmentIdentification equipmentIdentification;

}
