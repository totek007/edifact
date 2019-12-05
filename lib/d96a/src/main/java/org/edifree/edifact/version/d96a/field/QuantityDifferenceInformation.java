package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C279
 * @name QUANTITY DIFFERENCE INFORMATION
 * @description Information on quantity difference.
 */

@Data
public class QuantityDifferenceInformation {

@Mandatory
@Length("0-15")
private Decimal quantityDifference;

@Length("0-3")
private String quantityQualifier;

}
