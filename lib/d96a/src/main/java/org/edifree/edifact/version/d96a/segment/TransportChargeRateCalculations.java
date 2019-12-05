package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id TCC
 * @name TRANSPORT CHARGE/RATE CALCULATIONS
 * @description A segment to specify a charge/rate, e.g. freight rate.
 */

@TagName("TCC")
@Data
public class TransportChargeRateCalculations {

private Charge charge;

private RateTariffClass rateTariffClass;

private CommodityRateDetail commodityRateDetail;

private RateTariffClassDetail rateTariffClassDetail;

}
