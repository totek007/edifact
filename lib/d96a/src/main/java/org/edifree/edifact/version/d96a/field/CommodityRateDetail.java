package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C528
 * @name COMMODITY/RATE DETAIL
 * @description Identification of commodity/rates.
 */

@Data
public class CommodityRateDetail {

@Length("0-18")
private String commodityRateIdentification;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

}
