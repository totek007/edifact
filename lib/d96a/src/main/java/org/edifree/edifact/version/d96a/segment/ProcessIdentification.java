package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id PRC
 * @name PROCESS IDENTIFICATION
 * @description A segment identifying a process relevant to the product item. The segment should be used for example to specify processes such as pest treatment, slaughtering, packing, storage, testing and preservation, together with any materials such as chemicals associated with the process.
 */

@TagName("PRC")
@Data
public class ProcessIdentification {

@Mandatory
private ProcessTypeAndDescription processTypeAndDescription;

}
