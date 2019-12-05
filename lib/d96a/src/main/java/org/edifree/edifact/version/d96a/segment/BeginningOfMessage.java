package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id BGM
 * @name BEGINNING OF MESSAGE
 * @description A segment by which the sender must uniquely identify the work grant request by means of its type and number and, when necessary, its function.
 */

@TagName("BGM")
@Data
public class BeginningOfMessage {

private DocumentMessageName documentMessageName;

@Length("0-35")
private String documentMessageNumber;

@Length("0-3")
private String messageFunctionCoded;

@Length("0-3")
private String responseTypeCoded;

}
