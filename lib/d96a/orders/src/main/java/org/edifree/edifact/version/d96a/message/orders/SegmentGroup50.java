package org.edifree.edifact.version.d96a.message.orders;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP50
 * @name SegmentGroup50
 * @description A group of segments to specify the scheduled quantities, date/time details of the schedule and where required the reference of the schedule.
 */

@Data
public class SegmentGroup50 {

@Mandatory
private Quantity quantity;

@MaxChild(5)
private List<DateTimePeriod> dateTimePeriod = new EdifactList<>();

}
