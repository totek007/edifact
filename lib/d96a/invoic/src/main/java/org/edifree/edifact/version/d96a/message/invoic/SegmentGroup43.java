package org.edifree.edifact.version.d96a.message.invoic;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP43
 * @name SegmentGroup43
 * @description A group of segments specifying tax related information for the allowance or charge and, when necessary.
 */

@Data
public class SegmentGroup43 {

@Mandatory
private DutyTaxFeeDetails dutyTaxFeeDetails;

private MonetaryAmount monetaryAmount;

}
