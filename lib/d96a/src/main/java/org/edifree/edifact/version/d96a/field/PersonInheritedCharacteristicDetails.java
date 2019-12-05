package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C818
 * @name PERSON INHERITED CHARACTERISTIC DETAILS
 * @description To specify an inherited characteristic of a person.
 */

@Data
public class PersonInheritedCharacteristicDetails {

@Length("0-8")
private String personInheritedCharacteristicIdentification;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-70")
private String personInheritedCharacteristic;

}
