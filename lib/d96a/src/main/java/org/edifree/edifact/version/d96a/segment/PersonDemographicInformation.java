package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id PDI
 * @name PERSON DEMOGRAPHIC INFORMATION
 * @description A segment indicating some addition information relating to the person expected for an employment i.e. gender, marital status...
 */

@TagName("PDI")
@Data
public class PersonDemographicInformation {

@Length("0-3")
private String sexCoded;

private MaritalStatusDetails maritalStatusDetails;

private ReligionDetails religionDetails;

}
