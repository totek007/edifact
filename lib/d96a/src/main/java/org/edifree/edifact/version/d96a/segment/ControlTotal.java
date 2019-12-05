package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id CNT
 * @name CONTROL TOTAL
 * @description A segment to provide message control totals as required. For example, the total number of members included in the message could be provided.
 */

@TagName("CNT")
@Data
public class ControlTotal {

@Mandatory
private Control control;

}
