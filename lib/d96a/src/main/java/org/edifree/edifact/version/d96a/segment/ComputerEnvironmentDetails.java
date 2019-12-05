package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id CED
 * @name COMPUTER ENVIRONMENT DETAILS
 * @description The segment will give additional information about the file identified in the previous EFI segment, like for example, conversion details.
 */

@TagName("CED")
@Data
public class ComputerEnvironmentDetails {

@Mandatory
@Length("0-3")
private String computerEnvironmentDetailsQualifier;

@Mandatory
private ComputerEnvironmentIdentification computerEnvironmentIdentification;

}
