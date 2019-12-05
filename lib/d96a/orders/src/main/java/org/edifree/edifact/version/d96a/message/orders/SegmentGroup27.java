package org.edifree.edifact.version.d96a.message.orders;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP27
 * @name SegmentGroup27
 * @description A group of segments specifying the terms of payment applicable for the line item. This may be used by a central buyer purchasing on behalf of different item consignee combinations.
 */

@Data
public class SegmentGroup27 {

@Mandatory
private PaymentTermsBasis paymentTermsBasis;

@MaxChild(5)
private List<DateTimePeriod> dateTimePeriod = new EdifactList<>();

private PercentageDetails percentageDetails;

private MonetaryAmount monetaryAmount;

}
