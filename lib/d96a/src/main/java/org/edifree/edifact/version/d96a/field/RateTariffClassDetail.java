package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C554
 * @name RATE/TARIFF CLASS DETAIL
 * @description Identification of the applicable rate/tariff class.
 */

@Data
public class RateTariffClassDetail {

@Length("0-9")
private String rateTariffClassIdentification;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

}
