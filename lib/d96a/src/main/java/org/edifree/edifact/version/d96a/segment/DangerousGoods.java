package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id DGS
 * @name DANGEROUS GOODS
 * @description A segment identifying transport related information for the movement of hazardous goods.
 */

@TagName("DGS")
@Data
public class DangerousGoods {

@Length("0-3")
private String dangerousGoodsRegulationsCoded;

private HazardCode hazardCode;

private UndgInformation undgInformation;

private DangerousGoodsShipmentFlashpoint dangerousGoodsShipmentFlashpoint;

@Length("0-3")
private String packingGroupCoded;

@Length("0-6")
private String emsNumber;

@Length("0-4")
private String mfag;

@Length("0-10")
private String tremCardNumber;

private HazardIdentification hazardIdentification;

private DangerousGoodsLabel dangerousGoodsLabel;

@Length("0-3")
private String packingInstructionCoded;

@Length("0-3")
private String categoryOfMeansOfTransportCoded;

@Length("0-3")
private String permissionForTransportCoded;

}
