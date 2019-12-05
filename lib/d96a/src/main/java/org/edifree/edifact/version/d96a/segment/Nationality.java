package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id NAT
 * @name NATIONALITY
 * @description A segment indicating nationality of the person expected to be employed.
 */

@TagName("NAT")
@Data
public class Nationality {

@Mandatory
@Length("0-3")
private String nationalityQualifier;

private NationalityDetails nationalityDetails;

}
