package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id PNA
 * @name PARTY NAME
 * @description A segment identifying names of the parties, in coded or clear form, and their functions relevant to the work grant request, e.g. a related job center involved with the work grant request. It is recommended that, where possible, only the coded form of the party identification should be specified, e.g. where the enterprise and the job administration are known to each other, only the coded identification is required, but a job center or a job application or interview address may vary and would have to be clearly specified, preferably in structured format.
 */

@TagName("PNA")
@Data
public class PartyName {

@Mandatory
@Length("0-3")
private String partyQualifier;

private IdentificationNumber identificationNumber;

private PartyIdentificationDetails partyIdentificationDetails;

@Length("0-3")
private String nameTypeCoded;

@Length("0-3")
private String nameStatusCoded;

private NameComponentDetails nameComponentDetails1;

private NameComponentDetails nameComponentDetails2;

private NameComponentDetails nameComponentDetails3;

private NameComponentDetails nameComponentDetails4;

private NameComponentDetails nameComponentDetails5;

}
