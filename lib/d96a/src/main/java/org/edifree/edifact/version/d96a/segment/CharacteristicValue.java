package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id CAV
 * @name CHARACTERISTIC VALUE
 * @description A segment identifying the value of attributes.
 */

@TagName("CAV")
@Data
public class CharacteristicValue {

@Mandatory
private CharacteristicValueC889 characteristicValueC889;

}
