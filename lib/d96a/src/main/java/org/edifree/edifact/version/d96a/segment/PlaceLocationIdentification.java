package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id LOC
 * @name PLACE/LOCATION IDENTIFICATION
 * @description A segment giving more specific location information of the party specified in the ADR segment, e.g. internal site or building number.
 */

@TagName("LOC")
@Data
public class PlaceLocationIdentification {

@Mandatory
@Length("0-3")
private String placeLocationQualifier;

private LocationIdentification locationIdentification;

private RelatedLocationOneIdentification relatedLocationOneIdentification;

private RelatedLocationTwoIdentification relatedLocationTwoIdentification;

@Length("0-3")
private String relationCoded;

}
