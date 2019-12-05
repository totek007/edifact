package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id ELM
 * @name SIMPLE DATA ELEMENT DETAILS
 * @description A segment identifying a simple data element and giving related information.
 */

@TagName("ELM")
@Data
public class SimpleDataElementDetails {

@Mandatory
@Length("0-4")
private String simpleDataElementTag;

@Length("0-3")
private String simpleDataElementCharacterRepresentationCoded;

@Length("0-3")
private String simpleDataElementLengthTypeCoded;

@Length("0-3")
private Decimal simpleDataElementMaximumLength;

@Length("0-3")
private Decimal simpleDataElementMinimumLength;

@Length("0-3")
private String codeSetIndicatorCoded;

@Length("0-3")
private String classDesignatorCoded;

@Length("0-3")
private String maintenanceOperationCoded;

}
