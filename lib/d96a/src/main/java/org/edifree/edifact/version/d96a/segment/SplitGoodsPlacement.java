package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id SGP
 * @name SPLIT GOODS PLACEMENT
 * @description A segment to identify the equipment in which the dangerous goods are transported.
 */

@TagName("SGP")
@Data
public class SplitGoodsPlacement {

@Mandatory
private EquipmentIdentification equipmentIdentification;

@Length("0-8")
private Decimal numberOfPackages;

}
