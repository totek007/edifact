package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id TMP
 * @name TEMPERATURE
 * @description A segment which identifies the temperature setting in relation to an equipment detail.
 */

@TagName("TMP")
@Data
public class Temperature {

@Mandatory
@Length("0-3")
private String temperatureQualifier;

private TemperatureSetting temperatureSetting;

}
