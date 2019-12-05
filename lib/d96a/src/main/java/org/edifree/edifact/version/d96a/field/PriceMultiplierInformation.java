package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C138
 * @name PRICE MULTIPLIER INFORMATION
 * @description Price multiplier and its identification.
 */

@Data
public class PriceMultiplierInformation {

@Mandatory
@Length("0-12")
private Decimal priceMultiplier;

@Length("0-3")
private String priceMultiplierQualifier;

}
