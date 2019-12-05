package org.edifree.edifact.version.d96a.message.orders;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP9
 * @name SegmentGroup9
 * @description A group of segments identifying the mode and means of transport, location and relevant dates and times for transportation, relating to the whole order.
 */

@Data
public class SegmentGroup9 {

@Mandatory
private DetailsOfTransport detailsOfTransport;

@MaxChild(10)
private List<SegmentGroup10> segmentGroup10 = new EdifactList<>();

}
