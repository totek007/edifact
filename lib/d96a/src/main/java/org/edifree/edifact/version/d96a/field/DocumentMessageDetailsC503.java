package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C503
 * @name DOCUMENT/MESSAGE DETAILS C503
 * @description Identification of document/message by number, status, source and/or language.
 */

@Data
public class DocumentMessageDetailsC503 {

@Length("0-35")
private String documentMessageNumber;

@Length("0-3")
private String documentMessageStatusCoded;

@Length("0-35")
private String documentMessageSource;

@Length("0-3")
private String languageCoded;

}
