package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C056
 * @name DEPARTMENT OR EMPLOYEE DETAILS
 * @description Code and/or name of a department or employee. Code preferred.
 */

@Data
public class DepartmentOrEmployeeDetails {

@Length("0-17")
private String departmentOrEmployeeIdentification;

@Length("0-35")
private String departmentOrEmployee;

}
