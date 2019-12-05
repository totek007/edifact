package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id GIN
 * @name GOODS IDENTITY NUMBER
 * @description A segment to specify identity numbers related to units of the product identified in the LIN segment, e.g. serial number.
 */

@TagName("GIN")
@Data
public class GoodsIdentityNumber {

@Mandatory
@Length("0-3")
private String identityNumberQualifier;

@Mandatory
private IdentityNumberRange identityNumberRange1;

private IdentityNumberRange identityNumberRange2;

private IdentityNumberRange identityNumberRange3;

private IdentityNumberRange identityNumberRange4;

private IdentityNumberRange identityNumberRange5;

}
