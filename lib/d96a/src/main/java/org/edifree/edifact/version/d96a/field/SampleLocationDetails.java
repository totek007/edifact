package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C514
 * @name SAMPLE LOCATION DETAILS
 * @description Identification of location within the specimen, from which the sample was taken.
 */

@Data
public class SampleLocationDetails {

@Length("0-3")
private String sampleLocationCoded;

@Length("0-35")
private String sampleLocation;

}
