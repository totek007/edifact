package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C825
 * @name DAMAGE SEVERITY
 * @description To specify the severity of damage to an object.
 */

@Data
public class DamageSeverity {

@Length("0-3")
private String damageSeverityCoded;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-35")
private String damageSeverity;

}
