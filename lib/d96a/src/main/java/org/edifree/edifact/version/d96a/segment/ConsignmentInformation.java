package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id CNI
 * @name CONSIGNMENT INFORMATION
 * @description A segment to indicate a consignment (in a consolidation) using the reference number of its transport document.
 */

@TagName("CNI")
@Data
public class ConsignmentInformation {

@Length("0-4")
private Decimal consolidationItemNumber;

private DocumentMessageDetails documentMessageDetails;

@Length("0-4")
private Decimal consignmentLoadSequenceNumber;

}
