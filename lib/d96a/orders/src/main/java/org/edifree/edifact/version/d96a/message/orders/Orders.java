package org.edifree.edifact.version.d96a.message.orders;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 *
 * @name orders
 */

@Data
@EqualsAndHashCode(callSuper=true)
public class Orders extends MessageObject {

@Mandatory
private MessageHeader messageHeader;

@Mandatory
private BeginningOfMessage beginningOfMessage;

@Mandatory
@MaxChild(35)
private List<DateTimePeriod> dateTimePeriod = new EdifactList<>();

private PaymentInstructions paymentInstructions;

@MaxChild(5)
private List<AdditionalInformation> additionalInformation = new EdifactList<>();

private ItemDescription itemDescription;

@MaxChild(99)
private List<FreeText> freeText = new EdifactList<>();

@MaxChild(10)
private List<SegmentGroup1> segmentGroup1 = new EdifactList<>();

@MaxChild(99)
private List<SegmentGroup2> segmentGroup2 = new EdifactList<>();

@MaxChild(5)
private List<SegmentGroup6> segmentGroup6 = new EdifactList<>();

@MaxChild(5)
private List<SegmentGroup7> segmentGroup7 = new EdifactList<>();

@MaxChild(10)
private List<SegmentGroup8> segmentGroup8 = new EdifactList<>();

@MaxChild(10)
private List<SegmentGroup9> segmentGroup9 = new EdifactList<>();

@MaxChild(5)
private List<SegmentGroup11> segmentGroup11 = new EdifactList<>();

@MaxChild(10)
private List<SegmentGroup12> segmentGroup12 = new EdifactList<>();

@MaxChild(10)
private List<SegmentGroup14> segmentGroup14 = new EdifactList<>();

@MaxChild(10)
private List<SegmentGroup15> segmentGroup15 = new EdifactList<>();

@MaxChild(25)
private List<SegmentGroup17> segmentGroup17 = new EdifactList<>();

@MaxChild(15)
private List<SegmentGroup18> segmentGroup18 = new EdifactList<>();

@MaxChild(100)
private List<SegmentGroup24> segmentGroup24 = new EdifactList<>();

@MaxChild(200000)
private List<SegmentGroup25> segmentGroup25 = new EdifactList<>();

@Mandatory
private SectionControl sectionControl;

@MaxChild(12)
private List<MonetaryAmount> monetaryAmount = new EdifactList<>();

@MaxChild(10)
private List<ControlTotal> controlTotal = new EdifactList<>();

@MaxChild(10)
private List<SegmentGroup54> segmentGroup54 = new EdifactList<>();

@Mandatory
private MessageTrailer messageTrailer;

}
