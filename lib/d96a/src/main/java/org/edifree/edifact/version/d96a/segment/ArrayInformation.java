package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id ARR
 * @name ARRAY INFORMATION
 * @description A segment containing the data in response to a question.
 */

@TagName("ARR")
@Data
public class ArrayInformation {

private PositionIdentification positionIdentification;

private ArrayCellDetails arrayCellDetails;

}
