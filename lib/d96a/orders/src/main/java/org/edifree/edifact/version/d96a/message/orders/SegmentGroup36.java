package org.edifree.edifact.version.d96a.message.orders;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP36
 * @name SegmentGroup36
 * @description A group of segments giving references only relevant to the specified party rather than the line item.
 */

@Data
public class SegmentGroup36 {

@Mandatory
private Reference reference;

@MaxChild(5)
private List<DateTimePeriod> dateTimePeriod = new EdifactList<>();

}
