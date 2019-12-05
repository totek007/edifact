package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id QVR
 * @name QUANTITY VARIANCES
 * @description A segment identifying quantity variances.
 */

@TagName("QVR")
@Data
public class QuantityVariances {

private QuantityDifferenceInformation quantityDifferenceInformation;

@Length("0-3")
private String discrepancyCoded;

private ReasonForChange reasonForChange;

}
