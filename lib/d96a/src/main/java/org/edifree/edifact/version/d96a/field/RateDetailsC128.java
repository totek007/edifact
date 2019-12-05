package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C128
 * @name RATE DETAILS C128
 * @description Rate per unit and rate basis.
 */

@Data
public class RateDetailsC128 {

@Mandatory
@Length("0-3")
private String rateTypeQualifier;

@Mandatory
@Length("0-15")
private Decimal ratePerUnit;

@Length("0-9")
private Decimal unitPriceBasis;

@Length("0-3")
private String measureUnitQualifier;

}
