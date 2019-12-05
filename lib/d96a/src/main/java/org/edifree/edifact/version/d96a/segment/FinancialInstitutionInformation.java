package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id FII
 * @name FINANCIAL INSTITUTION INFORMATION
 * @description A segment providing financial institution information relating to the preceding PAI segment.
 */

@TagName("FII")
@Data
public class FinancialInstitutionInformation {

@Mandatory
@Length("0-3")
private String partyQualifier;

private AccountIdentification accountIdentification;

private InstitutionIdentification institutionIdentification;

@Length("0-3")
private String countryCoded;

}
