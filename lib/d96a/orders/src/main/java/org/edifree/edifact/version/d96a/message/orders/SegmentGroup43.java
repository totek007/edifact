package org.edifree.edifact.version.d96a.message.orders;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP43
 * @name SegmentGroup43
 * @description A group of segments specifying the rate per unit and basis to which the allowance or charge applies e.g. The allowance/charge amount is 3 DEM per 10 tons.
 */

@Data
public class SegmentGroup43 {

@Mandatory
private RateDetails rateDetails;

private RangeDetails rangeDetails;

}
