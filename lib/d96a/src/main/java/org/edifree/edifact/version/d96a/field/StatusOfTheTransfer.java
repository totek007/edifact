package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id S010
 * @name STATUS OF THE TRANSFER
 * @description Statement that the message is one in a sequence of transfers relating to the same topic.
 */

@Data
public class StatusOfTheTransfer {

@Mandatory
@Length("0-2")
private Decimal sequenceMessageTransferNumber;

@Length("1")
private Decimal firstLastSequenceMessageTransferIndication;

}
