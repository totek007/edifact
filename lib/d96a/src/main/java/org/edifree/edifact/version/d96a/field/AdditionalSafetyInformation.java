package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C815
 * @name ADDITIONAL SAFETY INFORMATION
 * @description To identify additional safety information.
 */

@Data
public class AdditionalSafetyInformation {

@Mandatory
@Length("0-3")
private String additionalSafetyInformationCoded;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-35")
private String additionalSafetyInformation;

}
