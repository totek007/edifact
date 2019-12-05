package org.edifree.edifact.version.d96a.message.invoic;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP25
 * @name SegmentGroup25
 * @description A group of segments providing details of the individual invoiced items. There must be at least one occurrence of Segment group 22 within an invoice, but not necessarily in a credit note or a debit note. This Segment group may be repeated to give sub-line details.
 */

@Data
public class SegmentGroup25 {

@Mandatory
private LineItem lineItem;

@MaxChild(25)
private List<AdditionalProductId> additionalProductId = new EdifactList<>();

@MaxChild(10)
private List<ItemDescription> itemDescription = new EdifactList<>();

@MaxChild(5)
private List<Measurements> measurements = new EdifactList<>();

@MaxChild(5)
private List<Quantity> quantity = new EdifactList<>();

private PercentageDetails percentageDetails;

@MaxChild(5)
private List<AdditionalInformation> additionalInformation = new EdifactList<>();

@MaxChild(35)
private List<DateTimePeriod> dateTimePeriod = new EdifactList<>();

@MaxChild(1000)
private List<GoodsIdentityNumber> goodsIdentityNumber = new EdifactList<>();

@MaxChild(1000)
private List<RelatedIdentificationNumbers> relatedIdentificationNumbers = new EdifactList<>();

private QuantityVariances quantityVariances;

private EquipmentDetails equipmentDetails;

@MaxChild(5)
private List<FreeText> freeText = new EdifactList<>();

@MaxChild(5)
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
private List<SegmentGroup32> segmentGroup32 = new EdifactList<>();

@MaxChild(99)
private List<SegmentGroup33> segmentGroup33 = new EdifactList<>();

@MaxChild(20)
private List<SegmentGroup34> segmentGroup34 = new EdifactList<>();

@MaxChild(15)
private List<SegmentGroup38> segmentGroup38 = new EdifactList<>();

@MaxChild(10)
private List<SegmentGroup44> segmentGroup44 = new EdifactList<>();

@MaxChild(5)
private List<SegmentGroup46> segmentGroup46 = new EdifactList<>();

@MaxChild(100)
private List<SegmentGroup47> segmentGroup47 = new EdifactList<>();

}
