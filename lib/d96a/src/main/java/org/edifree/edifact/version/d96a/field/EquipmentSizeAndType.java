package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C224
 * @name EQUIPMENT SIZE AND TYPE
 * @description Code and/or name identifying size and type of equipment used in transport. Code preferred.
 */

@Data
public class EquipmentSizeAndType {

@Length("0-10")
private String equipmentSizeAndTypeIdentification;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-35")
private String equipmentSizeAndType;

}
