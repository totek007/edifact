package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id EQN
 * @name NUMBER OF UNITS
 * @description A segment to identify the number of units of attached equipment.
 */

@TagName("EQN")
@Data
public class NumberOfUnits {

@Mandatory
private NumberOfUnitDetails numberOfUnitDetails;

}
