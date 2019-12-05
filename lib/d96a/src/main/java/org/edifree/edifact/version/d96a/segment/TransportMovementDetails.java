package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id TMD
 * @name TRANSPORT MOVEMENT DETAILS
 * @description A segment to specify transport movement details for the equipment.
 */

@TagName("TMD")
@Data
public class TransportMovementDetails {

private MovementType movementType;

@Length("0-26")
private String equipmentPlan;

@Length("0-3")
private String haulageArrangementsCoded;

}
