package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id ADR
 * @name ADDRESS
 * @description A segment giving the address of the relevant party.
 */

@TagName("ADR")
@Data
public class Address {

private AddressUsage addressUsage;

private AddressDetails addressDetails;

@Length("0-35")
private String cityName;

@Length("0-9")
private String postcodeIdentification;

@Length("0-3")
private String countryCoded;

private CountrySubentityDetails countrySubentityDetails;

private LocationIdentification locationIdentification;

}
