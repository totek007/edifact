package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id CTA
 * @name CONTACT INFORMATION
 * @description A segment to identify a person or department and their function, to whom communications should be directed.
 */

@TagName("CTA")
@Data
public class ContactInformation {

@Length("0-3")
private String contactFunctionCoded;

private DepartmentOrEmployeeDetails departmentOrEmployeeDetails;

}
