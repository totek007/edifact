package org.edifree.edifact.version.d96a.message.orders;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP34
 * @name SegmentGroup34
 * @description A group of segments specifying tax related information, and when necessary, the location(s) to which that tax information relates.
 */

@Data
public class SegmentGroup34 {

@Mandatory
private DutyTaxFeeDetails dutyTaxFeeDetails;

private MonetaryAmount monetaryAmount;

@MaxChild(5)
private List<PlaceLocationIdentification> placeLocationIdentification = new EdifactList<>();

}
