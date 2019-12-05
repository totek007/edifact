package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C527
 * @name STATISTICAL DETAILS
 * @description Specifications related to statistical measurements.
 */

@Data
public class StatisticalDetails {

@Length("0-18")
private Decimal measurementValue;

@Length("0-3")
private String measureUnitQualifier;

@Length("0-3")
private String measurementDimensionCoded;

@Length("0-3")
private String measurementSignificanceCoded;

}
