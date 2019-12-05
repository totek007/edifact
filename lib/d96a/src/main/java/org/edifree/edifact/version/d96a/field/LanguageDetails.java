package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C508
 * @name LANGUAGE DETAILS
 * @description To identify a language.
 */

@Data
public class LanguageDetails {

@Length("0-3")
private String languageCoded;

@Length("0-35")
private String language;

}
