package org.edifree.edifact.version.d96a.message.orders;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP47
 * @name SegmentGroup47
 * @description A group of segments indicating the terms of delivery for the line item where this is different to or not specified within the heading section.
 */

@Data
public class SegmentGroup47 {

@Mandatory
private TermsOfDeliveryOrTransport termsOfDeliveryOrTransport;

@MaxChild(2)
private List<PlaceLocationIdentification> placeLocationIdentification = new EdifactList<>();

}
