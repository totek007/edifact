package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C826
 * @name ACTION
 * @description To indicate an action which has been taken or is to be taken (e.g. in relation to a certain object).
 */

@Data
public class Action {

@Length("0-3")
private String actionRequestNotificationCoded;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-35")
private String actionRequestNotification;

}
