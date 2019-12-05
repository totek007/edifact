package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id DTM
 * @name DATE/TIME/PERIOD
 * @description A segment specifying the date or time related to the party given in the PNA segment.
 */

@TagName("DTM")
@Data
public class DateTimePeriod {

@Mandatory
private DateTimePeriodC507 dateTimePeriodC507;

}
