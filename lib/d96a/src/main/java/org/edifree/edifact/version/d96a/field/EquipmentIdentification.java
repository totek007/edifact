package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C237
 * @name EQUIPMENT IDENTIFICATION
 * @description Marks (letters and/or numbers) identifying equipment used for transport such as a container.
 */

@Data
public class EquipmentIdentification {

@Length("0-17")
private String equipmentIdentificationNumber;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-3")
private String countryCoded;

}
