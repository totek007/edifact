package org.edifree.edifact.version.d96a.message.invoic;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP12
 * @name SegmentGroup12
 * @description A group of segments indicating the terms of delivery for the whole invoice.
 */

@Data
public class SegmentGroup12 {

@Mandatory
private TermsOfDeliveryOrTransport termsOfDeliveryOrTransport;

@MaxChild(2)
private List<PlaceLocationIdentification> placeLocationIdentification = new EdifactList<>();

}
