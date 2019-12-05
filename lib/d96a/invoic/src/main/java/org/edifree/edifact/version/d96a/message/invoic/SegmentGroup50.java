package org.edifree.edifact.version.d96a.message.invoic;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP50
 * @name SegmentGroup50
 * @description A group of segments specifying taxes totals for the invoice.
 */

@Data
public class SegmentGroup50 {

@Mandatory
private DutyTaxFeeDetails dutyTaxFeeDetails;

@MaxChild(2)
private List<MonetaryAmount> monetaryAmount = new EdifactList<>();

}
