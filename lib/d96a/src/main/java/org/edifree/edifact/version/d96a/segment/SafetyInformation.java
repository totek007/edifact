package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id SFI
 * @name SAFETY INFORMATION
 * @description A segment identifying the hazard/safety report section (e.g. one of the 16 sections required by EEC law) or type that the group of segments is associated with.
 */

@TagName("SFI")
@Data
public class SafetyInformation {

@Mandatory
@Length("0-12")
private String hierarchicalIdNumber;

private SafetySection safetySection;

private AdditionalSafetyInformation additionalSafetyInformation;

@Length("0-3")
private String maintenanceOperationCoded;

}
