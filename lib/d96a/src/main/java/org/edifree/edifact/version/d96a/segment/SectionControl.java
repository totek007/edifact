package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id UNS
 * @name SECTION CONTROL
 * @description A mandatory service segment placed before the first user segment in the detail section to avoid segment collision.
 */

@TagName("UNS")
@Data
public class SectionControl {

@Mandatory
@Length("1")
private String sectionIdentification;

}
