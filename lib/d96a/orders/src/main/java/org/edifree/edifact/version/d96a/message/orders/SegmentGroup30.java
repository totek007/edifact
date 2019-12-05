package org.edifree.edifact.version.d96a.message.orders;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP30
 * @name SegmentGroup30
 * @description A group of segments identifying the packaging, physical dimensions, and marks and numbers for goods referenced in the line item.
 */

@Data
public class SegmentGroup30 {

@Mandatory
private PackageObject packageObject;

@MaxChild(5)
private List<Measurements> measurements = new EdifactList<>();

@MaxChild(5)
private List<Quantity> quantity = new EdifactList<>();

@MaxChild(5)
private List<DateTimePeriod> dateTimePeriod = new EdifactList<>();

private SegmentGroup31 segmentGroup31;

@MaxChild(5)
private List<SegmentGroup32> segmentGroup32 = new EdifactList<>();

}
