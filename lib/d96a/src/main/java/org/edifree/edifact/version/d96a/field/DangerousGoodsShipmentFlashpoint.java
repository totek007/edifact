package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C223
 * @name DANGEROUS GOODS SHIPMENT FLASHPOINT
 * @description Temperature at which a vapor according to ISO 1523/73 can be ignited.
 */

@Data
public class DangerousGoodsShipmentFlashpoint {

@Length("3")
private Decimal shipmentFlashpoint;

@Length("0-3")
private String measureUnitQualifier;

}
