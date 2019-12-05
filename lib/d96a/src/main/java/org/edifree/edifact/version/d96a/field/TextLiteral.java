package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C108
 * @name TEXT LITERAL
 * @description Free text; one to five lines.
 */

@Data
public class TextLiteral {

@Mandatory
@Length("0-70")
private String freeText1;

@Length("0-70")
private String freeText2;

@Length("0-70")
private String freeText3;

@Length("0-70")
private String freeText4;

@Length("0-70")
private String freeText5;

}
