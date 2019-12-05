package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id DMS
 * @name DOCUMENT/MESSAGE SUMMARY
 * @description A segment identifying the commercial document number, the document type and the number of detail lines within the document heading this group.
 */

@TagName("DMS")
@Data
public class DocumentMessageSummary {

@Length("0-35")
private String documentMessageNumber;

@Length("0-3")
private String documentMessageNameCoded;

@Length("0-15")
private Decimal totalNumberOfItems;

}
