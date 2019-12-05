package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id MEA
 * @name MEASUREMENTS
 * @description A segment to provide a measurement related to the tank or deadweight item, such as: - gross weight of tank contents - volume of liquid in the tank - specific gravity - percentage full
 */

@TagName("MEA")
@Data
public class Measurements {

@Mandatory
@Length("0-3")
private String measurementApplicationQualifier;

private MeasurementDetails measurementDetails;

private ValueRange valueRange;

@Length("0-3")
private String surfaceLayerIndicatorCoded;

}
