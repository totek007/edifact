package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C517
 * @name LOCATION IDENTIFICATION
 * @description Identification of a location by code or name.
 */

@Data
public class LocationIdentification {

@Length("0-25")
private String placeLocationIdentification;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-70")
private String placeLocation;

}
