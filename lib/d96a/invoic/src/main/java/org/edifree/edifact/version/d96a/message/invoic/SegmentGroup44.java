package org.edifree.edifact.version.d96a.message.invoic;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP44
 * @name SegmentGroup44
 * @description A group of segments identifying the mode and means of transport, location and relevant dates and times for transportation, relating to the line item, where this is different to or not specified within the heading section.
 */

@Data
public class SegmentGroup44 {

@Mandatory
private DetailsOfTransport detailsOfTransport;

@MaxChild(10)
private List<SegmentGroup45> segmentGroup45 = new EdifactList<>();

}
