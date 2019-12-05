package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id SEG
 * @name SEGMENT IDENTIFICATION
 * @description A segment identifying a segment type and specifying its class and maintenance operation.
 */

@TagName("SEG")
@Data
public class SegmentIdentification {

@Mandatory
@Length("0-3")
private String segmentTag;

@Length("0-3")
private String classDesignatorCoded;

@Length("0-3")
private String maintenanceOperationCoded;

}
