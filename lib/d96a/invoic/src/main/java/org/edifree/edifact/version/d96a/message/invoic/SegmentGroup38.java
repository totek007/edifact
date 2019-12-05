package org.edifree.edifact.version.d96a.message.invoic;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP38
 * @name SegmentGroup38
 * @description A group of segments specifying allowances and charges for the line item where this is different to or not specified within the heading section.
 */

@Data
public class SegmentGroup38 {

@Mandatory
private AllowanceOrCharge allowanceOrCharge;

@MaxChild(5)
private List<AdditionalInformation> additionalInformation = new EdifactList<>();

@MaxChild(5)
private List<DateTimePeriod> dateTimePeriod = new EdifactList<>();

private SegmentGroup39 segmentGroup39;

private SegmentGroup40 segmentGroup40;

@MaxChild(2)
private List<SegmentGroup41> segmentGroup41 = new EdifactList<>();

private SegmentGroup42 segmentGroup42;

@MaxChild(5)
private List<SegmentGroup43> segmentGroup43 = new EdifactList<>();

}
