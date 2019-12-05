package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C545
 * @name INDEX IDENTIFICATION
 * @description To identify an index.
 */

@Data
public class IndexIdentification {

@Mandatory
@Length("0-3")
private String indexQualifier;

@Length("0-3")
private String indexTypeCoded;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

}
