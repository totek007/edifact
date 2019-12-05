package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id RTE
 * @name RATE DETAILS
 * @description A segment specifying the rate per unit and the basis for calculation.
 */

@TagName("RTE")
@Data
public class RateDetails {

@Mandatory
private RateDetailsC128 rateDetailsC128;

}
