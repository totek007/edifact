package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C082
 * @name PARTY IDENTIFICATION DETAILS
 * @description Identification of a transaction party by code.
 */

@Data
public class PartyIdentificationDetails {

@Mandatory
@Length("0-35")
private String partyIdIdentification;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

}
