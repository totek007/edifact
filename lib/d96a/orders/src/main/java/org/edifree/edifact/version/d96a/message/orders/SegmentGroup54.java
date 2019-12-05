package org.edifree.edifact.version.d96a.message.orders;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP54
 * @name SegmentGroup54
 * @description A group of segments specifying allowances and charges summary totals for the order.
 */

@Data
public class SegmentGroup54 {

@Mandatory
private AllowanceOrCharge allowanceOrCharge;

private AdditionalInformation additionalInformation;

@Mandatory
@MaxChild(2)
private List<MonetaryAmount> monetaryAmount = new EdifactList<>();

}
