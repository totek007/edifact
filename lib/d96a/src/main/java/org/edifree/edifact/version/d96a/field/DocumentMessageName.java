package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C002
 * @name DOCUMENT/MESSAGE NAME
 * @description Identification of a type of document/message by code or name. Code preferred.
 */

@Data
public class DocumentMessageName {

@Length("0-3")
private String documentMessageNameCoded;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-35")
private String documentMessageName;

}
