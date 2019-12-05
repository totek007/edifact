package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id FNS
 * @name FOOTNOTE SET
 * @description A segment identifying a set of footnotes, which are either defined in this group or have been defined previously.
 */

@TagName("FNS")
@Data
public class FootnoteSet {

@Mandatory
private FootnoteSetIdentification footnoteSetIdentification;

private PartyIdentificationDetails partyIdentificationDetails;

@Length("0-3")
private String statusCoded;

@Length("0-3")
private String maintenanceOperationCoded;

}
