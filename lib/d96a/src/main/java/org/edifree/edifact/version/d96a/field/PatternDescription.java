package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C329
 * @name PATTERN DESCRIPTION
 * @description Shipment, delivery or production interval pattern and timing.
 */

@Data
public class PatternDescription {

@Length("0-3")
private String frequencyCoded;

@Length("0-3")
private String despatchPatternCoded;

@Length("0-3")
private String despatchPatternTimingCoded;

}
