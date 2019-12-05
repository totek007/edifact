package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C822
 * @name DAMAGE AREA
 * @description To specify where the damage is on an object.
 */

@Data
public class DamageArea {

@Length("0-4")
private String damageAreaIdentification;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-35")
private String damageArea;

}
