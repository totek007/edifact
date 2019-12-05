package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C509
 * @name PRICE INFORMATION
 * @description Identification of price type, price and related details.
 */

@Data
public class PriceInformation {

@Mandatory
@Length("0-3")
private String priceQualifier;

@Length("0-15")
private Decimal price;

@Length("0-3")
private String priceTypeCoded;

@Length("0-3")
private String priceTypeQualifier;

@Length("0-9")
private Decimal unitPriceBasis;

@Length("0-3")
private String measureUnitQualifier;

}
