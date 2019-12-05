package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C203
 * @name RATE/TARIFF CLASS
 * @description Identification of the applicable rate/tariff class.
 */

@Data
public class RateTariffClass {

@Mandatory
@Length("0-9")
private String rateTariffClassIdentification;

@Length("0-3")
private String codeListQualifier1;

@Length("0-3")
private String codeListResponsibleAgencyCoded1;

@Length("0-35")
private String rateTariffClass;

@Length("0-6")
private String supplementaryRateTariffBasisIdentification1;

@Length("0-3")
private String codeListQualifier2;

@Length("0-3")
private String codeListResponsibleAgencyCoded2;

@Length("0-6")
private String supplementaryRateTariffBasisIdentification2;

@Length("0-3")
private String codeListQualifier3;

@Length("0-3")
private String codeListResponsibleAgencyCoded3;

}
