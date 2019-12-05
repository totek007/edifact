package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id LAN
 * @name LANGUAGE
 * @description A segment providing language information which relates to the preceding NAD segment.
 */

@TagName("LAN")
@Data
public class Language {

@Mandatory
@Length("0-3")
private String languageQualifier;

private LanguageDetails languageDetails;

}
