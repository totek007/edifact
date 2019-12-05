package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C240
 * @name PRODUCT CHARACTERISTIC
 * @description Specific product characteristic data.
 */

@Data
public class ProductCharacteristic {

@Mandatory
@Length("0-17")
private String characteristicIdentification;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-35")
private String characteristic1;

@Length("0-35")
private String characteristic2;

}
