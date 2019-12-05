package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C200
 * @name CHARGE
 * @description Identification of a charge by code and/or by name.
 */

@Data
public class Charge {

@Length("0-17")
private String freightAndChargesIdentification;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-26")
private String freightAndCharges;

@Length("0-3")
private String prepaidCollectIndicatorCoded;

@Length("0-35")
private String itemNumber;

}
