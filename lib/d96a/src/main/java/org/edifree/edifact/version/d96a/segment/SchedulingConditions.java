package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id SCC
 * @name SCHEDULING CONDITIONS
 * @description A segment specifying the type and status of the schedule being given, and optionally defining a pattern to be established, e.g. firm or proposed delivery schedule for a weekly pattern.
 */

@TagName("SCC")
@Data
public class SchedulingConditions {

@Mandatory
@Length("0-3")
private String deliveryPlanStatusIndicatorCoded;

@Length("0-3")
private String deliveryRequirementsCoded;

private PatternDescription patternDescription;

}
