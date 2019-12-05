package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id GRU
 * @name SEGMENT GROUP USAGE DETAILS
 * @description A segment specifying the usage of a segment group in a message type structure.
 */

@TagName("GRU")
@Data
public class SegmentGroupUsageDetails {

@Mandatory
@Length("0-4")
private String groupIdentification;

@Length("0-3")
private String requirementDesignatorCoded;

@Length("0-7")
private Decimal maximumNumberOfOccurrences;

@Length("0-3")
private String maintenanceOperationCoded;

@Length("0-6")
private String sequenceNumber;

}
