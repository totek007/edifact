package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id COM
 * @name COMMUNICATION CONTACT
 * @description A segment to identify a communications type and number for the contact specified in the CTA segment, e.g. telephone-number, fax-number, telex-number.
 */

@TagName("COM")
@Data
public class CommunicationContact {

@Mandatory
private CommunicationContactC076 communicationContactC076;

}
