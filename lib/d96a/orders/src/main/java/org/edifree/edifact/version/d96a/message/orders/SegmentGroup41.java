package org.edifree.edifact.version.d96a.message.orders;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP41
 * @name SegmentGroup41
 * @description A group of segments specifying the percentage for the allowance or charge e.g. The allowance/charge amount is calculated as 5% of the goods value or a price reduction of 5% may be specified if the goods quantity ordered is within the range 5 tons to 10 tons.
 */

@Data
public class SegmentGroup41 {

@Mandatory
private PercentageDetails percentageDetails;

private RangeDetails rangeDetails;

}
