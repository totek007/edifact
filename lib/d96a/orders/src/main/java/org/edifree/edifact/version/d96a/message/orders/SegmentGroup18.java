package org.edifree.edifact.version.d96a.message.orders;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP18
 * @name SegmentGroup18
 * @description A group of segments specifying allowances and charges for the whole order. The allowance or charge specified within this Segment group may either relate to the total order in which case it cannot be overridden at detail level, or it can relate to the line items as a default allowance/charge and can be overridden by the ALC Segment group within the detail section. Where relevant, additional information, tax and alternate currency details are to be indicated in the TRI and MOA segments. The basis for the calculation of the allowance/charge may be a quantity, a percentage, an amount or a rate and one of the Segment group 19-22 should be used accordingly.
 */

@Data
public class SegmentGroup18 {

@Mandatory
private AllowanceOrCharge allowanceOrCharge;

@MaxChild(5)
private List<AdditionalInformation> additionalInformation = new EdifactList<>();

@MaxChild(5)
private List<DateTimePeriod> dateTimePeriod = new EdifactList<>();

private SegmentGroup19 segmentGroup19;

private SegmentGroup20 segmentGroup20;

@MaxChild(2)
private List<SegmentGroup21> segmentGroup21 = new EdifactList<>();

private SegmentGroup22 segmentGroup22;

@MaxChild(5)
private List<SegmentGroup23> segmentGroup23 = new EdifactList<>();

}
