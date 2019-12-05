package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id BII
 * @name STRUCTURE IDENTIFICATION
 * @description A segment to identify the item of work to which this quantity determination applies.
 */

@TagName("BII")
@Data
public class StructureIdentification {

@Mandatory
@Length("0-3")
private String indexingStructureQualifier;

@Mandatory
private BillLevelIdentification billLevelIdentification;

@Length("0-35")
private String itemNumber;

}
