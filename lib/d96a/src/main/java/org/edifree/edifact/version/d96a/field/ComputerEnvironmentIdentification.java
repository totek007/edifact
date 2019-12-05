package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C079
 * @name COMPUTER ENVIRONMENT IDENTIFICATION
 * @description To identify parts of a computer environment.
 */

@Data
public class ComputerEnvironmentIdentification {

@Length("0-3")
private String computerEnvironmentCoded;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-35")
private String computerEnvironment;

@Length("0-9")
private String version;

@Length("0-9")
private String release;

@Length("0-35")
private String identityNumber;

}
