package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id RNG
 * @name RANGE DETAILS
 * @description A segment to identify a remuneration range, when an exact remuneration amount in the MOA segment is not available. The remuneration range is related to the type of remuneration in the MOA segment.
 */

@TagName("RNG")
@Data
public class RangeDetails {

@Mandatory
@Length("0-3")
private String rangeTypeQualifier;

private Range range;

}
