package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C522
 * @name INSTRUCTION
 * @description To specify an instruction.
 */

@Data
public class Instruction {

@Mandatory
@Length("0-3")
private String instructionQualifier;

@Length("0-3")
private String instructionCoded;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-35")
private String instruction;

}
