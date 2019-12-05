package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C556
 * @name STATUS REASON
 * @description To specify the reason behind a status event.
 */

@Data
public class StatusReason {

@Mandatory
@Length("0-3")
private String statusReasonCoded;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-35")
private String statusReason;

}
