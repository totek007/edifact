package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C516
 * @name MONETARY AMOUNT C516
 * @description Amount of goods or services stated as a monetary amount in a specified currency.
 */

@Data
public class MonetaryAmountC516 {

@Mandatory
@Length("0-3")
private String monetaryAmountTypeQualifier;

@Length("0-18")
private Decimal monetaryAmount;

@Length("0-3")
private String currencyCoded;

@Length("0-3")
private String currencyQualifier;

@Length("0-3")
private String statusCoded;

}
