package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id PTY
 * @name PRIORITY
 * @description A segment identifying the priority of requirements for a job offered.
 */

@TagName("PTY")
@Data
public class Priority {

@Mandatory
@Length("0-3")
private String priorityQualifier;

private PriorityDetails priorityDetails;

}
