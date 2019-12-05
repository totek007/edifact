package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C186
 * @name QUANTITY DETAILS
 * @description Quantity information in a transaction, qualified when relevant.
 */

@Data
public class QuantityDetails {

@Mandatory
@Length("0-3")
private String quantityQualifier;

@Mandatory
@Length("0-15")
private Decimal quantity;

@Length("0-3")
private String measureUnitQualifier;

}
