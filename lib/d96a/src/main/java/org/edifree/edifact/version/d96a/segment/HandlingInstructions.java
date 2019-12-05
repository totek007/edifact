package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id HAN
 * @name HANDLING INSTRUCTIONS
 * @description A segment providing information on the handling of hazardous materials.
 */

@TagName("HAN")
@Data
public class HandlingInstructions {

private HandlingInstructionsC524 handlingInstructionsC524;

private HazardousMaterial hazardousMaterial;

}
