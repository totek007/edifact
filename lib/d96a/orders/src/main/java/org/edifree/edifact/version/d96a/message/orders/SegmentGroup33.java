package org.edifree.edifact.version.d96a.message.orders;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP33
 * @name SegmentGroup33
 * @description A group of segments specifying destination and quantity details for consignments involving multi-destination deliveries.
 */

@Data
public class SegmentGroup33 {

@Mandatory
private PlaceLocationIdentification placeLocationIdentification;

private Quantity quantity;

@MaxChild(5)
private List<DateTimePeriod> dateTimePeriod = new EdifactList<>();

}
