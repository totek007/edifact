package org.edifree.edifact.version.d96a.message.orders;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP19
 * @name SegmentGroup19
 * @description A group of segments specifying the quantity of the allowance or charge with its measure unit specifier. A range to which the allowance or charge applies may be specified e.g. an allowance of a free quantity of 20 pieces may be specified if the goods quantity ordered is greater than 1000 pieces.
 */

@Data
public class SegmentGroup19 {

@Mandatory
private Quantity quantity;

private RangeDetails rangeDetails;

}
