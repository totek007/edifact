package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C280
 * @name RANGE
 * @description Range minimum and maximum limits.
 */

@Data
public class Range {

@Mandatory
@Length("0-3")
private String measureUnitQualifier;

@Length("0-18")
private Decimal rangeMinimum;

@Length("0-18")
private Decimal rangeMaximum;

}
