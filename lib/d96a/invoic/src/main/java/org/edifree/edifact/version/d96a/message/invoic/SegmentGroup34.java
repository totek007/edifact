package org.edifree.edifact.version.d96a.message.invoic;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP34
 * @name SegmentGroup34
 * @description A group of segments identifying the parties with associated information, relevant to the line item only.
 */

@Data
public class SegmentGroup34 {

@Mandatory
private NameAndAddress nameAndAddress;

@MaxChild(5)
private List<PlaceLocationIdentification> placeLocationIdentification = new EdifactList<>();

@MaxChild(5)
private List<SegmentGroup35> segmentGroup35 = new EdifactList<>();

@MaxChild(5)
private List<SegmentGroup36> segmentGroup36 = new EdifactList<>();

@MaxChild(5)
private List<SegmentGroup37> segmentGroup37 = new EdifactList<>();

}
