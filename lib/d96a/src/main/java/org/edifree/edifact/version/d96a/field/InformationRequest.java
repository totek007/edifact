package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C333
 * @name INFORMATION REQUEST
 * @description To specify the information requested in a responding message.
 */

@Data
public class InformationRequest {

@Length("0-3")
private String requestedInformationCoded;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-35")
private String requestedInformation;

}
