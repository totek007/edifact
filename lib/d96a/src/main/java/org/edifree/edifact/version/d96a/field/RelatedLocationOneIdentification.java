package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C519
 * @name RELATED LOCATION ONE IDENTIFICATION
 * @description Identification the first related location by code or name.
 */

@Data
public class RelatedLocationOneIdentification {

@Length("0-25")
private String relatedPlaceLocationOneIdentification;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-70")
private String relatedPlaceLocationOne;

}
