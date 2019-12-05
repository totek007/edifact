package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id PRI
 * @name PRICE DETAILS
 * @description A segment to specify the price type and amount. The price used in the calculation of the total sales monetary amount will normally be the selling price.
 */

@TagName("PRI")
@Data
public class PriceDetails {

private PriceInformation priceInformation;

@Length("0-3")
private String sublinePriceChangeCoded;

}
