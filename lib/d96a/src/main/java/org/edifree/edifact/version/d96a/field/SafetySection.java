package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C814
 * @name SAFETY SECTION
 * @description To identify the safety section to which information relates.
 */

@Data
public class SafetySection {

@Mandatory
@Length("0-2")
private Decimal safetySection;

@Length("0-70")
private String safetySectionName;

}
