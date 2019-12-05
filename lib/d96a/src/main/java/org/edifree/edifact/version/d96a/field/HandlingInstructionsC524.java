package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C524
 * @name HANDLING INSTRUCTIONS C524
 * @description Instruction for the handling of goods, products or articles in shipment, storage etc.
 */

@Data
public class HandlingInstructionsC524 {

@Length("0-3")
private String handlingInstructionsCoded;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-70")
private String handlingInstructions;

}
