package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id STA
 * @name STATISTICS
 * @description A segment to specify the values required for statistics including codes to define the type of statistics and the measure unit employed.
 */

@TagName("STA")
@Data
public class Statistics {

@Mandatory
@Length("0-3")
private String statisticTypeCoded;

private StatisticalDetails statisticalDetails;

}
