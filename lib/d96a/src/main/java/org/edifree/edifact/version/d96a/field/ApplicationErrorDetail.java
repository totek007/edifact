package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C901
 * @name APPLICATION ERROR DETAIL
 * @description Code assigned by the recipient of a message to indicate a data validation error condition.
 */

@Data
public class ApplicationErrorDetail {

@Mandatory
@Length("0-8")
private String applicationErrorIdentification;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

}
