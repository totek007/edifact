package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C601
 * @name STATUS TYPE
 * @description To specify the type of status in relation to an industry sector or business function.
 */

@Data
public class StatusType {

@Mandatory
@Length("0-3")
private String statusTypeCoded;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

}
