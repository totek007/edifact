package org.edifree.edifact.version.d96a.message.orders;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP42
 * @name SegmentGroup42
 * @description A group of segments specifying a monetary amount for an allowance or charge. A range to which the allowance or charge applies can be specified e.g. an allowance of 5000 BEF may be specified if goods value ordered is greater than 100000 BEF.
 */

@Data
public class SegmentGroup42 {

@Mandatory
private MonetaryAmount monetaryAmount;

private RangeDetails rangeDetails;

}
