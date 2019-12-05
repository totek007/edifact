package org.edifree.edifact.version.d96a.message.orders;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP5
 * @name SegmentGroup5
 * @description A group of segments giving contact details of the specific person or department within the party identified in the NAD segment.
 */

@Data
public class SegmentGroup5 {

@Mandatory
private ContactInformation contactInformation;

@MaxChild(5)
private List<CommunicationContact> communicationContact = new EdifactList<>();

}
