package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id ATT
 * @name ATTRIBUTE
 * @description A segment identifying in coded form additional remuneration information and other benefits. The codes are related working conditions, working time, employment contract, piece of work and remuneration benefits.
 */

@TagName("ATT")
@Data
public class Attribute {

@Mandatory
@Length("0-3")
private String attributeFunctionQualifier;

private AttributeType attributeType;

private AttributeDetails attributeDetails;

}
