package org.edifree.edifact.version.d96a.message.invoic;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP15
 * @name SegmentGroup15
 * @description A group of segments specifying allowances and charges for the whole invoice. The allowance or charge specified within this Segment group may either relate to the total invoice in which case it cannot be overridden at detail level, or it can relate to the line items as a default allowance/charge and can be overridden by the ALC Segment group within the detail section. Where relevant, additional information, tax and alternate currency details are to be indicated in the TAX and MOA segments. The basis for the calculation of the allowance/charge may be a quantity, a percentage, an amount or a rate and one of the Segment group 15-19 should be used accordingly.
 */

@Data
public class SegmentGroup15 {

@Mandatory
private AllowanceOrCharge allowanceOrCharge;

@MaxChild(5)
private List<AdditionalInformation> additionalInformation = new EdifactList<>();

@MaxChild(5)
private List<SegmentGroup16> segmentGroup16 = new EdifactList<>();

private SegmentGroup17 segmentGroup17;

private SegmentGroup18 segmentGroup18;

@MaxChild(2)
private List<SegmentGroup19> segmentGroup19 = new EdifactList<>();

private SegmentGroup20 segmentGroup20;

@MaxChild(5)
private List<SegmentGroup21> segmentGroup21 = new EdifactList<>();

}
