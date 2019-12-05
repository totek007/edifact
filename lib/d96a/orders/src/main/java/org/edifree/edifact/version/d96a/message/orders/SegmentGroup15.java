package org.edifree.edifact.version.d96a.message.orders;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP15
 * @name SegmentGroup15
 * @description A group of segments specifying requested delivery schedules relating to quantities, frequencies, dates and references, required for the whole order.
 */

@Data
public class SegmentGroup15 {

@Mandatory
private SchedulingConditions schedulingConditions;

@MaxChild(5)
private List<FreeText> freeText = new EdifactList<>();

@MaxChild(5)
private List<Reference> reference = new EdifactList<>();

@MaxChild(10)
private List<SegmentGroup16> segmentGroup16 = new EdifactList<>();

}
