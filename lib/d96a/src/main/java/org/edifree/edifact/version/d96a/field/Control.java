package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C270
 * @name CONTROL
 * @description Control total for checking integrity of a message or part of a message.
 */

@Data
public class Control {

@Mandatory
@Length("0-3")
private String controlQualifier;

@Mandatory
@Length("0-18")
private Decimal controlValue;

@Length("0-3")
private String measureUnitQualifier;

}
