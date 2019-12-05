package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id AUT
 * @name AUTHENTICATION RESULT
 * @description A segment to specify the results of the application of an authentication procedure, enabling to check the authenticity of the sender and the integrity of the data.
 */

@TagName("AUT")
@Data
public class AuthenticationResult {

@Mandatory
@Length("0-35")
private String validationResult;

@Length("0-35")
private String validationKeyIdentification;

}
