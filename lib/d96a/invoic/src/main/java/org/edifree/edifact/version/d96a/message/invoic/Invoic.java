package org.edifree.edifact.version.d96a.message.invoic;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 *
 * @name invoic
 */

@Data
@EqualsAndHashCode(callSuper=true)
public class Invoic extends MessageObject {

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

@MaxChild(10)
private List<FreeText> freeText = new EdifactList<>();

@MaxChild(99)
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
private List<SegmentGroup12> segmentGroup12 = new EdifactList<>();

@MaxChild(1000)
private List<SegmentGroup13> segmentGroup13 = new EdifactList<>();

@MaxChild(9999)
private List<SegmentGroup15> segmentGroup15 = new EdifactList<>();

@MaxChild(100)
private List<SegmentGroup22> segmentGroup22 = new EdifactList<>();

private SegmentGroup23 segmentGroup23;

private SegmentGroup24 segmentGroup24;

@MaxChild(9999999)
private List<SegmentGroup25> segmentGroup25 = new EdifactList<>();

@Mandatory
private SectionControl sectionControl;

@MaxChild(10)
private List<ControlTotal> controlTotal = new EdifactList<>();

@Mandatory
@MaxChild(100)
private List<SegmentGroup48> segmentGroup48 = new EdifactList<>();

@MaxChild(10)
private List<SegmentGroup50> segmentGroup50 = new EdifactList<>();

@MaxChild(15)
private List<SegmentGroup51> segmentGroup51 = new EdifactList<>();

@Mandatory
private MessageTrailer messageTrailer;

}
