package org.edifree.edifact.version.d96a.message.invoic;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP28
 * @name SegmentGroup28
 * @description A group of segments identifying the relevant pricing information for the goods or services invoiced.
 */

@Data
public class SegmentGroup28 {

@Mandatory
private PriceDetails priceDetails;

private AdditionalPriceInformation additionalPriceInformation;

private RangeDetails rangeDetails;

@MaxChild(5)
private List<DateTimePeriod> dateTimePeriod = new EdifactList<>();

}
