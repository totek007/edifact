package org.edifree.edifact.version.d96a.message.invoic;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP51
 * @name SegmentGroup51
 * @description A group of segments specifying allowances and charges summary totals for the invoice.
 */

@Data
public class SegmentGroup51 {

@Mandatory
private AllowanceOrCharge allowanceOrCharge;

private AdditionalInformation additionalInformation;

@MaxChild(2)
private List<MonetaryAmount> monetaryAmount = new EdifactList<>();

}
