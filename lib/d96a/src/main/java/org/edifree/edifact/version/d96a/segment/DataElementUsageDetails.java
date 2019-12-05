package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id ELU
 * @name DATA ELEMENT USAGE DETAILS
 * @description A segment specifying component data elements in a composite data element and its related information.
 */

@TagName("ELU")
@Data
public class DataElementUsageDetails {

@Mandatory
@Length("0-4")
private String dataElementTag;

@Length("0-3")
private String requirementDesignatorCoded;

@Length("0-6")
private String sequenceNumber;

@Length("0-3")
private String maintenanceOperationCoded;

}
