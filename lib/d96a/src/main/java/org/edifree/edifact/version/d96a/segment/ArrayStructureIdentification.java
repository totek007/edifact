package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id ASI
 * @name ARRAY STRUCTURE IDENTIFICATION
 * @description A segment containing the unique identifier of the array structure.
 */

@TagName("ASI")
@Data
public class ArrayStructureIdentification {

@Mandatory
private ArrayStructureIdentificationC779 arrayStructureIdentificationC779;

private PartyIdentificationDetails partyIdentificationDetails;

@Length("0-3")
private String statusCoded;

@Length("0-3")
private String maintenanceOperationCoded;

}
