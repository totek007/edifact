package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C211
 * @name DIMENSIONS C211
 * @description Specification of the dimensions of a transportable unit.
 */

@Data
public class DimensionsC211 {

@Mandatory
@Length("0-3")
private String measureUnitQualifier;

@Length("0-15")
private Decimal lengthDimension;

@Length("0-15")
private Decimal widthDimension;

@Length("0-15")
private Decimal heightDimension;

}
