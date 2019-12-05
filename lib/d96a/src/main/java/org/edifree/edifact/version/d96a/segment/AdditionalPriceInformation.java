package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id APR
 * @name ADDITIONAL PRICE INFORMATION
 * @description A segment to identify pricing information such as a price multiplier, the class or type of trade and additionally identifying the reason for any changes.
 */

@TagName("APR")
@Data
public class AdditionalPriceInformation {

@Length("0-3")
private String classOfTradeCoded;

private PriceMultiplierInformation priceMultiplierInformation;

private ReasonForChange reasonForChange;

}
