package org.edifree.edifact.version.d96a.message.orders;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP17
 * @name SegmentGroup17
 * @description A group of segments providing information concerning pricing related to the type of trade, and where appropriate, indication of quantities, dates/periods or amounts.
 */

@Data
public class SegmentGroup17 {

@Mandatory
private AdditionalPriceInformation additionalPriceInformation;

@MaxChild(5)
private List<DateTimePeriod> dateTimePeriod = new EdifactList<>();

private RangeDetails rangeDetails;

}
