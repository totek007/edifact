package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C553
 * @name RELATED LOCATION TWO IDENTIFICATION
 * @description Identification of second related location by code or name.
 */

@Data
public class RelatedLocationTwoIdentification {

@Length("0-25")
private String relatedPlaceLocationTwoIdentification;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-70")
private String relatedPlaceLocationTwo;

}
