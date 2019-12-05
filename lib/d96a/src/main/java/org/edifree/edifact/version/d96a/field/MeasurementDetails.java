package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C502
 * @name MEASUREMENT DETAILS
 * @description Identification of measurement type.
 */

@Data
public class MeasurementDetails {

@Length("0-3")
private String measurementDimensionCoded;

@Length("0-3")
private String measurementSignificanceCoded;

@Length("0-3")
private String measurementAttributeCoded;

@Length("0-70")
private String measurementAttribute;

}
