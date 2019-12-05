package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C850
 * @name STATUS OF INSTRUCTION
 * @description Provides information regarding the status of an instruction.
 */

@Data
public class StatusOfInstruction {

@Mandatory
@Length("0-3")
private String statusCoded;

@Length("0-35")
private String partyName;

}
