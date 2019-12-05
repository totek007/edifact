package org.edifree.edifact.version.d96a.message.orders;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP49
 * @name SegmentGroup49
 * @description A group of segments specifying requested delivery schedules relating to quantities, frequencies, and dates, required for the line item, where this is different to or not specified within the heading section.
 */

@Data
public class SegmentGroup49 {

@Mandatory
private SchedulingConditions schedulingConditions;

@MaxChild(5)
private List<FreeText> freeText = new EdifactList<>();

@MaxChild(5)
private List<Reference> reference = new EdifactList<>();

@MaxChild(10)
private List<SegmentGroup50> segmentGroup50 = new EdifactList<>();

}
