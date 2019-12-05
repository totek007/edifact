package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C819
 * @name COUNTRY SUB-ENTITY DETAILS
 * @description To specify a part of a country (eg county or part of a city).
 */

@Data
public class CountrySubentityDetails {

@Length("0-9")
private String countrySubentityIdentification;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-35")
private String countrySubentity;

}
