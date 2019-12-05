package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id NAD
 * @name NAME AND ADDRESS
 * @description A segment to identify a name and address of a party, such as: - message sender - message recipient - ordering customer/principal - ordering customer agent
 */

@TagName("NAD")
@Data
public class NameAndAddress {

@Mandatory
@Length("0-3")
private String partyQualifier;

private PartyIdentificationDetails partyIdentificationDetails;

private NameAndAddressC058 nameAndAddressC058;

private PartyNameC080 partyNameC080;

private Street street;

@Length("0-35")
private String cityName;

@Length("0-9")
private String countrySubentityIdentification;

@Length("0-9")
private String postcodeIdentification;

@Length("0-3")
private String countryCoded;

}
