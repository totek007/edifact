package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C523
 * @name NUMBER OF UNIT DETAILS
 * @description Identification of number of units and its purpose.
 */

@Data
public class NumberOfUnitDetails {

@Length("0-15")
private Decimal numberOfUnits;

@Length("0-3")
private String numberOfUnitsQualifier;

}
