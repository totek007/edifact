package org.edifree.edifact.version.d96a.message.orders;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP7
 * @name SegmentGroup7
 * @description A group of segments specifying the currencies and related dates/periods valid for the whole order. Currency data may be omitted in national applications but will be required for international transactions.
 */

@Data
public class SegmentGroup7 {

@Mandatory
private Currencies currencies;

@MaxChild(5)
private List<PercentageDetails> percentageDetails = new EdifactList<>();

@MaxChild(5)
private List<DateTimePeriod> dateTimePeriod = new EdifactList<>();

}
