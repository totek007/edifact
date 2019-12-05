package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id STS
 * @name STATUS
 * @description A segment giving transport status report, e.g., damaged, customs refusal and totally missing.
 */

@TagName("STS")
@Data
public class Status {

private StatusType statusType;

private StatusEvent statusEvent;

private StatusReason statusReason1;

private StatusReason statusReason2;

private StatusReason statusReason3;

private StatusReason statusReason4;

private StatusReason statusReason5;

}
