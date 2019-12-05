package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id SGU
 * @name SEGMENT USAGE DETAILS
 * @description A segment specifying the usage of a segment in a message type structure.
 */

@TagName("SGU")
@Data
public class SegmentUsageDetails {

@Mandatory
@Length("0-3")
private String segmentTag;

@Length("0-3")
private String requirementDesignatorCoded;

@Length("0-7")
private Decimal maximumNumberOfOccurrences;

@Length("1")
private Decimal levelNumber;

@Length("0-6")
private String sequenceNumber;

@Length("0-3")
private String messageSectionCoded;

@Length("0-3")
private String maintenanceOperationCoded;

}
