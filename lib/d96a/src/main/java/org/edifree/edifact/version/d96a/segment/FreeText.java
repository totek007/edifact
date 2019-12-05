package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id FTX
 * @name FREE TEXT
 * @description A segment with free text information, in coded or clear form, used when additional information is needed but cannot be accommodated within other segments. In computer to computer exchanges such text will normally require the receiver to process this segment manually.
 */

@TagName("FTX")
@Data
public class FreeText {

@Mandatory
@Length("0-3")
private String textSubjectQualifier;

@Length("0-3")
private String textFunctionCoded;

private TextReference textReference;

private TextLiteral textLiteral;

@Length("0-3")
private String languageCoded;

}
