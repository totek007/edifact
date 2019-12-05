package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id UNT
 * @name MESSAGE TRAILER
 * @description A service segment ending a message, giving the total number of segments in the message and the control reference number of the message.
 */

@TagName("UNT")
@Data
public class MessageTrailer {

@Mandatory
@Length("0-6")
private Decimal numberOfSegmentsInAMessage;

@Mandatory
@Length("0-14")
private String messageReferenceNumber;

}
