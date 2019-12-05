package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id UNH
 * @name MESSAGE HEADER
 * @description A service segment starting and uniquely identifying a message. The message type code for the Work grant request message is WKGRRE.
 */

@TagName("UNH")
@Data
public class MessageHeader {

@Mandatory
@Length("0-14")
private String messageReferenceNumber;

@Mandatory
private MessageIdentifier messageIdentifier;

@Length("0-35")
private String commonAccessReference;

private StatusOfTheTransfer statusOfTheTransfer;

}
