package org.edifree.edifact.version.d96a.message.orders;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP11
 * @name SegmentGroup11
 * @description A group of segments indicating the terms of delivery for the whole order.
 */

@Data
public class SegmentGroup11 {

@Mandatory
private TermsOfDeliveryOrTransport termsOfDeliveryOrTransport;

@MaxChild(2)
private List<PlaceLocationIdentification> placeLocationIdentification = new EdifactList<>();

}
