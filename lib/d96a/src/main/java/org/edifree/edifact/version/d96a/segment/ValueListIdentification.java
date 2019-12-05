package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id VLI
 * @name VALUE LIST IDENTIFICATION
 * @description A segment identifying the value list.
 */

@TagName("VLI")
@Data
public class ValueListIdentification {

@Mandatory
private ValueListIdentificationC780 valueListIdentificationC780;

private PartyIdentificationDetails partyIdentificationDetails;

@Length("0-3")
private String statusCoded;

@Length("0-70")
private String valueListName;

@Length("0-3")
private String classDesignatorCoded;

@Length("0-3")
private String valueListTypeCoded;

private ProductCharacteristic productCharacteristic;

@Length("0-3")
private String maintenanceOperationCoded;

}
