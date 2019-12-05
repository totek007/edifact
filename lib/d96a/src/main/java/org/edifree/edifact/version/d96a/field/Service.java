package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C233
 * @name SERVICE
 * @description To identify a service (which may constitute an additional component to a basic contract).
 */

@Data
public class Service {

@Mandatory
@Length("0-3")
private String serviceRequirementCoded1;

@Length("0-3")
private String codeListQualifier1;

@Length("0-3")
private String codeListResponsibleAgencyCoded1;

@Length("0-3")
private String serviceRequirementCoded2;

@Length("0-3")
private String codeListQualifier2;

@Length("0-3")
private String codeListResponsibleAgencyCoded2;

}
