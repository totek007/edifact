package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id EMP
 * @name EMPLOYMENT DETAILS
 * @description A segment to identify the related area or sector of a qualification and the qualification, in coded or clear form, related to a job.
 */

@TagName("EMP")
@Data
public class EmploymentDetails {

@Mandatory
@Length("0-3")
private String employmentQualifier;

private EmploymentCategory employmentCategory;

private Occupation occupation;

private QualificationClassification qualificationClassification;

@Length("0-35")
private String jobTitle;

@Length("0-3")
private String qualificationAreaCoded;

}
