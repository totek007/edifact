package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id EQD
 * @name EQUIPMENT DETAILS
 * @description A segment identifying a unit of equipment used to transport the product item. The segment should be used for example to specify a container or ships hold.
 */

@TagName("EQD")
@Data
public class EquipmentDetails {

@Mandatory
@Length("0-3")
private String equipmentQualifier;

private EquipmentIdentification equipmentIdentification;

private EquipmentSizeAndType equipmentSizeAndType;

@Length("0-3")
private String equipmentSupplierCoded;

@Length("0-3")
private String equipmentStatusCoded;

@Length("0-3")
private String fullEmptyIndicatorCoded;

}
