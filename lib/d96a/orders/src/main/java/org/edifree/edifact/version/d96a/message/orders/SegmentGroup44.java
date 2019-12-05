package org.edifree.edifact.version.d96a.message.orders;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP44
 * @name SegmentGroup44
 * @description A group of segments specifying tax related information for the allowance or charge.
 */

@Data
public class SegmentGroup44 {

@Mandatory
private DutyTaxFeeDetails dutyTaxFeeDetails;

private MonetaryAmount monetaryAmount;

}
