package org.edifree.edifact.version.d96a.message.orders;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP45
 * @name SegmentGroup45
 * @description A group of segments identifying the mode and means of transport, location and relevant dates and times for transportation, relating to the line item, where this is different to or not specified within the heading section.
 */

@Data
public class SegmentGroup45 {

@Mandatory
private DetailsOfTransport detailsOfTransport;

@MaxChild(10)
private List<SegmentGroup46> segmentGroup46 = new EdifactList<>();

}
