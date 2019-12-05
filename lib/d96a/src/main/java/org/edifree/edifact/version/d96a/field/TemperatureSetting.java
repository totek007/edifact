package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C239
 * @name TEMPERATURE SETTING
 * @description The temperature under which the goods are (to be) stored or shipped.
 */

@Data
public class TemperatureSetting {

@Length("3")
private Decimal temperatureSetting;

@Length("0-3")
private String measureUnitQualifier;

}
