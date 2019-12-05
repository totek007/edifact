package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id DIM
 * @name DIMENSIONS
 * @description A segment to specify dimensions of the deadweight item, such as: - length expressed in 'longitudinal centre of gravity' - width expressed in 'transverse centre of gravity (from centerline)' - height expressed in 'vertical centre of gravity (from keel)'
 */

@TagName("DIM")
@Data
public class Dimensions {

@Mandatory
@Length("0-3")
private String dimensionQualifier;

@Mandatory
private DimensionsC211 dimensionsC211;

}
