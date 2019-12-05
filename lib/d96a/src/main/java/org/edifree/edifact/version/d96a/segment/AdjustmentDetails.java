package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id AJT
 * @name ADJUSTMENT DETAILS
 * @description A segment giving adjustment details.
 */

@TagName("AJT")
@Data
public class AdjustmentDetails {

@Mandatory
@Length("0-3")
private String adjustmentReasonCoded;

@Length("0-6")
private Decimal lineItemNumber;

}
