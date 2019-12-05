package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C849
 * @name PARTIES TO INSTRUCTION C849
 * @description Identify the sending and receiving parties of the instruction.
 */

@Data
public class PartiesToInstructionC849 {

@Mandatory
@Length("0-17")
private String partyEnactingInstructionIdentification;

@Length("0-17")
private String recipientOfTheInstructionIdentification;

}
