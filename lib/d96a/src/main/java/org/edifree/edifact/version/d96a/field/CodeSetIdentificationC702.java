package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C702
 * @name CODE SET IDENTIFICATION C702
 * @description To identify a code set.
 */

@Data
public class CodeSetIdentificationC702 {

@Length("0-4")
private String simpleDataElementTag;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

}
