package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id MOA
 * @name MONETARY AMOUNT
 * @description A segment giving information about the type and the amount of the remuneration.
 */

@TagName("MOA")
@Data
public class MonetaryAmount {

@Mandatory
private MonetaryAmountC516 monetaryAmountC516;

}
