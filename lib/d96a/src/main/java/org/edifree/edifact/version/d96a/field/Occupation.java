package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C951
 * @name OCCUPATION
 * @description Description of an occupation.
 */

@Data
public class Occupation {

@Length("0-3")
private String occupationCoded;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-35")
private String occupation1;

@Length("0-35")
private String occupation2;

}
