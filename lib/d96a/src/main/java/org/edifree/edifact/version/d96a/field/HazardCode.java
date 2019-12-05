package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C205
 * @name HAZARD CODE
 * @description The identification of the dangerous goods in code.
 */

@Data
public class HazardCode {

@Mandatory
@Length("0-7")
private String hazardCodeIdentification;

@Length("0-7")
private String hazardSubstanceItemPageNumber;

@Length("0-10")
private String hazardCodeVersionNumber;

}
