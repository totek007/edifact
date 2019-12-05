package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C948
 * @name EMPLOYMENT CATEGORY
 * @description Code and/or description of an employment category.
 */

@Data
public class EmploymentCategory {

@Length("0-3")
private String employmentCategoryCoded;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-35")
private String employmentCategory;

}
