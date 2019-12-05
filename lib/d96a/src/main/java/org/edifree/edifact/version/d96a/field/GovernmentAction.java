package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C232
 * @name GOVERNMENT ACTION
 * @description Code indicating a type of government action.
 */

@Data
public class GovernmentAction {

@Length("0-3")
private String governmentAgencyCoded;

@Length("0-3")
private String governmentInvolvementCoded;

@Length("0-3")
private String governmentActionCoded;

@Length("0-3")
private String governmentProcedureCoded;

}
