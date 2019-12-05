package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C174
 * @name VALUE/RANGE
 * @description Measurement value and relevant minimum and maximum tolerances in that order.
 */

@Data
public class ValueRange {

@Mandatory
@Length("0-3")
private String measureUnitQualifier;

@Length("0-18")
private Decimal measurementValue;

@Length("0-18")
private Decimal rangeMinimum;

@Length("0-18")
private Decimal rangeMaximum;

@Length("0-2")
private Decimal significantDigits;

}
