package org.edifree.edifact.version.d96a.message.orders;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP48
 * @name SegmentGroup48
 * @description A group of segments providing information relating to equipment identification and ownership, handling and notification of hazardous materials, relating to the line item where this is different to or not specified within the heading section.
 */

@Data
public class SegmentGroup48 {

@Mandatory
private EquipmentDetails equipmentDetails;

@MaxChild(5)
private List<HandlingInstructions> handlingInstructions = new EdifactList<>();

@MaxChild(5)
private List<Measurements> measurements = new EdifactList<>();

@MaxChild(5)
private List<FreeText> freeText = new EdifactList<>();

}
