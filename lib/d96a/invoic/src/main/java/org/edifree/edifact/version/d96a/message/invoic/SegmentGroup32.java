package org.edifree.edifact.version.d96a.message.invoic;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP32
 * @name SegmentGroup32
 * @description A group of segments specifying destination and quantity details for consignments involving multi-destination deliveries for a specified line item.
 */

@Data
public class SegmentGroup32 {

@Mandatory
private PlaceLocationIdentification placeLocationIdentification;

@MaxChild(100)
private List<Quantity> quantity = new EdifactList<>();

@MaxChild(5)
private List<DateTimePeriod> dateTimePeriod = new EdifactList<>();

}
