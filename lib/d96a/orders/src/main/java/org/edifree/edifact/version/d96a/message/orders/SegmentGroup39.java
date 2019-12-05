package org.edifree.edifact.version.d96a.message.orders;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP39
 * @name SegmentGroup39
 * @description A group of segments specifying allowances and charges for the line item where this is different to or not specified within the heading section.
 */

@Data
public class SegmentGroup39 {

@Mandatory
private AllowanceOrCharge allowanceOrCharge;

@MaxChild(5)
private List<AdditionalInformation> additionalInformation = new EdifactList<>();

@MaxChild(5)
private List<DateTimePeriod> dateTimePeriod = new EdifactList<>();

private SegmentGroup40 segmentGroup40;

private SegmentGroup41 segmentGroup41;

@MaxChild(2)
private List<SegmentGroup42> segmentGroup42 = new EdifactList<>();

private SegmentGroup43 segmentGroup43;

@MaxChild(5)
private List<SegmentGroup44> segmentGroup44 = new EdifactList<>();

}
