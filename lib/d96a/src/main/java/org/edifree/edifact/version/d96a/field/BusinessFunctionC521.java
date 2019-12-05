package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C521
 * @name BUSINESS FUNCTION C521
 * @description To specify a business reason.
 */

@Data
public class BusinessFunctionC521 {

@Mandatory
@Length("0-3")
private String businessFunctionQualifier;

@Mandatory
@Length("0-3")
private String businessFunctionCoded;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-70")
private String businessDescription;

}
