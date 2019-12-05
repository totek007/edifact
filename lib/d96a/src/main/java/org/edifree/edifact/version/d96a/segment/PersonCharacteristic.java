package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id IHC
 * @name PERSON CHARACTERISTIC
 * @description A segment for specifying person inherited characteristics such as ethnic origin, hair colour, etc. of the related person.
 */

@TagName("IHC")
@Data
public class PersonCharacteristic {

@Mandatory
@Length("0-3")
private String personCharacteristicQualifier;

private PersonInheritedCharacteristicDetails personInheritedCharacteristicDetails;

}
