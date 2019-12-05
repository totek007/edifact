package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id CUX
 * @name CURRENCIES
 * @description A segment identifying the currency and associated exchange rate of the member's salary and contributions.
 */

@TagName("CUX")
@Data
public class Currencies {

private CurrencyDetails currencyDetails1;

private CurrencyDetails currencyDetails2;

@Length("0-12")
private Decimal rateOfExchange;

@Length("0-3")
private String currencyMarketExchangeCoded;

}
