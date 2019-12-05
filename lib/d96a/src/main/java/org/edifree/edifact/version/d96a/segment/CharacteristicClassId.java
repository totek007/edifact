package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id CCI
 * @name CHARACTERISTIC/CLASS ID
 * @description A segment identifying particular characteristic about which information will be required.
 */

@TagName("CCI")
@Data
public class CharacteristicClassId {

@Length("0-3")
private String propertyClassCoded;

private MeasurementDetails measurementDetails;

private ProductCharacteristic productCharacteristic;

}
