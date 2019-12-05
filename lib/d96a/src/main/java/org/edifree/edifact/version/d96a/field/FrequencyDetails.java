package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C526
 * @name FREQUENCY DETAILS
 * @description Number of samples collected per specified unit of measure.
 */

@Data
public class FrequencyDetails {

@Mandatory
@Length("0-3")
private String frequencyQualifier;

@Length("0-9")
private Decimal frequencyValue;

@Length("0-3")
private String measureUnitQualifier;

}
