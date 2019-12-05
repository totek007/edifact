package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id QTY
 * @name QUANTITY
 * @description A segment identifying the quantity of employees of an enterprise, divided into workers and remunerated staff and each group further divided into foreigners and natives.
 */

@TagName("QTY")
@Data
public class Quantity {

@Mandatory
private QuantityDetails quantityDetails;

}
