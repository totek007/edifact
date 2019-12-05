package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C088
 * @name INSTITUTION IDENTIFICATION
 * @description Identification of a financial institution by code branch number, or name and name of place. Code or branch number preferred.
 */

@Data
public class InstitutionIdentification {

@Length("0-11")
private String institutionNameIdentification;

@Length("0-3")
private String codeListQualifier1;

@Length("0-3")
private String codeListResponsibleAgencyCoded1;

@Length("0-17")
private String institutionBranchNumber;

@Length("0-3")
private String codeListQualifier2;

@Length("0-3")
private String codeListResponsibleAgencyCoded2;

@Length("0-70")
private String institutionName;

@Length("0-70")
private String institutionBranchPlace;

}
