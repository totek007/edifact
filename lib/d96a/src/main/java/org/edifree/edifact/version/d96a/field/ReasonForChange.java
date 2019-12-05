package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C960
 * @name REASON FOR CHANGE
 * @description Code and/or description of the reason for a change.
 */

@Data
public class ReasonForChange {

@Length("0-3")
private String changeReasonCoded;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-35")
private String changeReason;

}
