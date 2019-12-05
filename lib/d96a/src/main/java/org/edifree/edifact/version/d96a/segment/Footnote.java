package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id FNT
 * @name FOOTNOTE
 * @description A segment containing the unique identifier of the footnote.
 */

@TagName("FNT")
@Data
public class Footnote {

@Mandatory
private FootnoteIdentification footnoteIdentification;

private PartyIdentificationDetails partyIdentificationDetails;

@Length("0-3")
private String statusCoded;

@Length("0-3")
private String maintenanceOperationCoded;

}
