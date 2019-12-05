package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C206
 * @name IDENTIFICATION NUMBER
 * @description The identification of an object.
 */

@Data
public class IdentificationNumber {

@Mandatory
@Length("0-35")
private String identityNumber;

@Length("0-3")
private String identityNumberQualifier;

@Length("0-3")
private String statusCoded;

}
