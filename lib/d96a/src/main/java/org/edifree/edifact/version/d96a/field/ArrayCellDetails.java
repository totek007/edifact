package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C770
 * @name ARRAY CELL DETAILS
 * @description To contain the data for a contiguous set of cells in an array.
 */

@Data
public class ArrayCellDetails {

@Length("0-35")
private String arrayCellInformation;

}
