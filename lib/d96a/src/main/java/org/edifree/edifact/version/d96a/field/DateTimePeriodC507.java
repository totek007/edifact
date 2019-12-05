package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C507
 * @name DATE/TIME/PERIOD C507
 * @description Date and/or time, or period relevant to the specified date/time/period type.
 */

@Data
public class DateTimePeriodC507 {

@Mandatory
@Length("0-3")
private String dateTimePeriodQualifier;

@Length("0-35")
private String dateTimePeriod;

@Length("0-3")
private String dateTimePeriodFormatQualifier;

}
