package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id RCS
 * @name REQUIREMENTS AND CONDITIONS
 * @description A segment to give, in coded form, conditions and reasons for the rejection of a work grant request.
 */

@TagName("RCS")
@Data
public class RequirementsAndConditions {

@Mandatory
@Length("0-3")
private String sectorSubjectIdentificationQualifier;

private RequirementConditionIdentification requirementConditionIdentification;

@Length("0-3")
private String actionRequestNotificationCoded;

}
