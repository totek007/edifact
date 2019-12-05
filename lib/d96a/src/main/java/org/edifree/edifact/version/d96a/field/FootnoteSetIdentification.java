package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C783
 * @name FOOTNOTE SET IDENTIFICATION
 * @description The identification of a set of footnotes.
 */

@Data
public class FootnoteSetIdentification {

@Mandatory
@Length("0-35")
private String footnoteSetIdentifier;

@Length("0-3")
private String identityNumberQualifier;

}
