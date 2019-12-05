package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id PCD
 * @name PERCENTAGE DETAILS
 * @description A segment containing percentage factors which relate to the service or product identified in the preceding IMD segment.
 */

@TagName("PCD")
@Data
public class PercentageDetails {

@Mandatory
private PercentageDetailsC501 percentageDetailsC501;

}
