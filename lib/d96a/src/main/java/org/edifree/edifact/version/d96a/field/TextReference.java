package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C107
 * @name TEXT REFERENCE
 * @description Coded reference to a standard text and its source.
 */

@Data
public class TextReference {

@Mandatory
@Length("0-3")
private String freeTextCoded;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

}
