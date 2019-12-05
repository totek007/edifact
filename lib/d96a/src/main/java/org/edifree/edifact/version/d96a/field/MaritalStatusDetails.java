package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C085
 * @name MARITAL STATUS DETAILS
 * @description To specify the marital status of a person.
 */

@Data
public class MaritalStatusDetails {

@Length("0-3")
private String maritalStatusCoded;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-35")
private String maritalStatus;

}
