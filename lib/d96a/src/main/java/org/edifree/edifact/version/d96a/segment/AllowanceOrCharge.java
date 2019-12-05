package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id ALC
 * @name ALLOWANCE OR CHARGE
 * @description A segment identifying the charge or allowance type to be summarized.
 */

@TagName("ALC")
@Data
public class AllowanceOrCharge {

@Mandatory
@Length("0-3")
private String allowanceOrChargeQualifier;

private AllowanceChargeInformation allowanceChargeInformation;

@Length("0-3")
private String settlementCoded;

@Length("0-3")
private String calculationSequenceIndicatorCoded;

private SpecialServicesIdentification specialServicesIdentification;

}
