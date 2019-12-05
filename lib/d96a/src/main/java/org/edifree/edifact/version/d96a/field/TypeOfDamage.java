package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C821
 * @name TYPE OF DAMAGE
 * @description To specify the type of damage to an object.
 */

@Data
public class TypeOfDamage {

@Length("0-3")
private String typeOfDamageCoded;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-35")
private String typeOfDamage;

}
