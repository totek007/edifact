package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id SCD
 * @name STRUCTURE COMPONENT DEFINITION
 * @description A segment to specify the identity of a question (e.g. in a questionnaire).
 */

@TagName("SCD")
@Data
public class StructureComponentDefinition {

@Mandatory
@Length("0-3")
private String componentFunctionQualifier;

private StructureComponentIdentification structureComponentIdentification;

private PartyIdentificationDetails partyIdentificationDetails;

@Length("0-3")
private String statusCoded;

@Length("0-2")
private Decimal configurationLevel;

private PositionIdentification positionIdentification;

private ProductCharacteristic productCharacteristic;

}
