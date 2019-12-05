package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C215
 * @name SEAL ISSUER
 * @description Identification of the issuer of a seal on equipment either by code or by name.
 */

@Data
public class SealIssuer {

@Length("0-3")
private String sealingPartyCoded;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-35")
private String sealingParty;

}
