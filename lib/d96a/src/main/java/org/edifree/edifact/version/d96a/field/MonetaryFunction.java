package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C549
 * @name MONETARY FUNCTION
 * @description To identify the function of a related monetary amount.
 */

@Data
public class MonetaryFunction {

@Mandatory
@Length("0-3")
private String monetaryFunctionCoded;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

}
