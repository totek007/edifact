package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id IDE
 * @name IDENTITY
 * @description A segment identifying a questionnaire.
 */

@TagName("IDE")
@Data
public class Identity {

@Mandatory
@Length("0-3")
private String identificationQualifier;

@Mandatory
private IdentificationNumber identificationNumber;

private PartyIdentificationDetails partyIdentificationDetails;

@Length("0-3")
private String statusCoded;

@Length("0-2")
private Decimal configurationLevel;

private PositionIdentification positionIdentification;

private ProductCharacteristic productCharacteristic;

}
