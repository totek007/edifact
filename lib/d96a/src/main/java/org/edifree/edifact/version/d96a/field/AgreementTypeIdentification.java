package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C543
 * @name AGREEMENT TYPE IDENTIFICATION
 * @description Identification of specific agreement type by code or name.
 */

@Data
public class AgreementTypeIdentification {

@Mandatory
@Length("0-3")
private String agreementTypeQualifier;

@Length("0-3")
private String agreementTypeCoded;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-70")
private String agreementTypeDescription;

}
