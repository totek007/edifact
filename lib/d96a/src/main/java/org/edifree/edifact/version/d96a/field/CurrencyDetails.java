package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C504
 * @name CURRENCY DETAILS
 * @description The usage to which a currency relates.
 */

@Data
public class CurrencyDetails {

@Mandatory
@Length("0-3")
private String currencyDetailsQualifier;

@Length("0-3")
private String currencyCoded;

@Length("0-3")
private String currencyQualifier;

@Length("0-4")
private Decimal currencyRateBase;

}
