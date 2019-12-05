package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id SEL
 * @name SEAL NUMBER
 * @description A segment identifying a seal and the seal issuer for the unit of equipment.
 */

@TagName("SEL")
@Data
public class SealNumber {

@Mandatory
@Length("0-10")
private String sealNumber;

private SealIssuer sealIssuer;

@Length("0-3")
private String sealConditionCoded;

}
