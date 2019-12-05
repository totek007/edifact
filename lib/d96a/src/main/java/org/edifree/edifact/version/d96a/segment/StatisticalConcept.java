package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id STC
 * @name STATISTICAL CONCEPT
 * @description A segment identifying a statistical concept.
 */

@TagName("STC")
@Data
public class StatisticalConcept {

@Mandatory
private StatisticalConceptIdentification statisticalConceptIdentification;

private PartyIdentificationDetails partyIdentificationDetails;

@Length("0-3")
private String statusCoded;

@Length("0-3")
private String maintenanceOperationCoded;

}
