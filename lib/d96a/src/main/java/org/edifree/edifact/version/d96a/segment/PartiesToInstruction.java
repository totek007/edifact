package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id INP
 * @name PARTIES TO INSTRUCTION
 * @description A segment to indicate instructions to parties in coded form.
 */

@TagName("INP")
@Data
public class PartiesToInstruction {

private PartiesToInstructionC849 partiesToInstructionC849;

private Instruction instruction;

private StatusOfInstruction statusOfInstruction;

@Length("0-3")
private String actionRequestNotificationCoded;

}
