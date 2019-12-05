package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id DAM
 * @name DAMAGE
 * @description A segment to specify equipment damages, such as the point of the damage on the equipment, and the type of damage.
 */

@TagName("DAM")
@Data
public class Damage {

@Mandatory
@Length("0-3")
private String damageDetailsQualifier;

private TypeOfDamage typeOfDamage;

private DamageArea damageArea;

private DamageSeverity damageSeverity;

private Action action;

}
