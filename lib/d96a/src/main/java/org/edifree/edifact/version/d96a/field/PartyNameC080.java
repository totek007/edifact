package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C080
 * @name PARTY NAME C080
 * @description Identification of a transaction party by name, one to five lines. Party name may be formatted.
 */

@Data
public class PartyNameC080 {

@Mandatory
@Length("0-35")
private String partyName1;

@Length("0-35")
private String partyName2;

@Length("0-35")
private String partyName3;

@Length("0-35")
private String partyName4;

@Length("0-35")
private String partyName5;

@Length("0-3")
private String partyNameFormatCoded;

}
