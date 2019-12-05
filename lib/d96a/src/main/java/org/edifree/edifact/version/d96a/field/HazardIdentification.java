package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C235
 * @name HAZARD IDENTIFICATION
 * @description Identification of the Orange placard required on the means of transport.
 */

@Data
public class HazardIdentification {

@Length("0-4")
private String hazardIdentificationNumberUpperPart;

@Length("4")
private String substanceIdentificationNumberLowerPart;

}
