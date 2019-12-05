package org.edifree.edifact.version.d96a.message.orders;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP6
 * @name SegmentGroup6
 * @description A group of segments specifying tax related information, and when necessary, the location(s) to which that tax information relates.
 */

@Data
public class SegmentGroup6 {

@Mandatory
private DutyTaxFeeDetails dutyTaxFeeDetails;

private MonetaryAmount monetaryAmount;

@MaxChild(5)
private List<PlaceLocationIdentification> placeLocationIdentification = new EdifactList<>();

}
