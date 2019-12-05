package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id GIR
 * @name RELATED IDENTIFICATION NUMBERS
 * @description A segment indicating the Insurance or identification numbers of the worker in the country identified in the related PNA segment.
 */

@TagName("GIR")
@Data
public class RelatedIdentificationNumbers {

@Mandatory
@Length("0-3")
private String setIdentificationQualifier;

@Mandatory
private IdentificationNumber identificationNumber1;

private IdentificationNumber identificationNumber2;

private IdentificationNumber identificationNumber3;

private IdentificationNumber identificationNumber4;

private IdentificationNumber identificationNumber5;

}
