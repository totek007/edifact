package org.edifree.edifact.version.d96a.message.orders;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP25
 * @name SegmentGroup25
 * @description A group of segments providing details of the individual ordered items. This Segment group may be repeated to give sub-line details.
 */

@Data
public class SegmentGroup25 {

@Mandatory
private LineItem lineItem;

@MaxChild(25)
private List<AdditionalProductId> additionalProductId = new EdifactList<>();

@MaxChild(99)
private List<ItemDescription> itemDescription = new EdifactList<>();

@MaxChild(5)
private List<Measurements> measurements = new EdifactList<>();

@MaxChild(10)
private List<Quantity> quantity = new EdifactList<>();

@MaxChild(5)
private List<PercentageDetails> percentageDetails = new EdifactList<>();

@MaxChild(5)
private List<AdditionalInformation> additionalInformation = new EdifactList<>();

@MaxChild(35)
private List<DateTimePeriod> dateTimePeriod = new EdifactList<>();

@MaxChild(10)
private List<MonetaryAmount> monetaryAmount = new EdifactList<>();

@MaxChild(1000)
private List<GoodsIdentityNumber> goodsIdentityNumber = new EdifactList<>();

@MaxChild(1000)
private List<RelatedIdentificationNumbers> relatedIdentificationNumbers = new EdifactList<>();

private QuantityVariances quantityVariances;

@MaxChild(5)
private List<DocumentMessageDetails> documentMessageDetails = new EdifactList<>();

private PaymentInstructions paymentInstructions;

@MaxChild(99)
private List<FreeText> freeText = new EdifactList<>();

@MaxChild(999)
private List<SegmentGroup26> segmentGroup26 = new EdifactList<>();

@MaxChild(10)
private List<SegmentGroup27> segmentGroup27 = new EdifactList<>();

@MaxChild(25)
private List<SegmentGroup28> segmentGroup28 = new EdifactList<>();

@MaxChild(10)
private List<SegmentGroup29> segmentGroup29 = new EdifactList<>();

@MaxChild(10)
private List<SegmentGroup30> segmentGroup30 = new EdifactList<>();

@MaxChild(9999)
private List<SegmentGroup33> segmentGroup33 = new EdifactList<>();

@MaxChild(10)
private List<SegmentGroup34> segmentGroup34 = new EdifactList<>();

@MaxChild(99)
private List<SegmentGroup35> segmentGroup35 = new EdifactList<>();

@MaxChild(99)
private List<SegmentGroup39> segmentGroup39 = new EdifactList<>();

@MaxChild(10)
private List<SegmentGroup45> segmentGroup45 = new EdifactList<>();

@MaxChild(5)
private List<SegmentGroup47> segmentGroup47 = new EdifactList<>();

@MaxChild(10)
private List<SegmentGroup48> segmentGroup48 = new EdifactList<>();

@MaxChild(100)
private List<SegmentGroup49> segmentGroup49 = new EdifactList<>();

@MaxChild(100)
private List<SegmentGroup51> segmentGroup51 = new EdifactList<>();

@MaxChild(10)
private List<SegmentGroup52> segmentGroup52 = new EdifactList<>();

}
