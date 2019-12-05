package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C889
 * @name CHARACTERISTIC VALUE C889
 * @description To provide the value of a characteristic.
 */

@Data
public class CharacteristicValueC889 {

@Length("0-3")
private String characteristicValueCoded;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-35")
private String characteristicValue1;

@Length("0-35")
private String characteristicValue2;

}
