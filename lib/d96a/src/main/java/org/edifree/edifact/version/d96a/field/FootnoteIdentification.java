package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C784
 * @name FOOTNOTE IDENTIFICATION
 * @description The identification of a footnote.
 */

@Data
public class FootnoteIdentification {

@Mandatory
@Length("0-35")
private String footnoteIdentifier;

@Length("0-3")
private String identityNumberQualifier;

}
