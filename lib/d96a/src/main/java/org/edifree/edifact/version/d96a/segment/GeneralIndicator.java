package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id GIS
 * @name GENERAL INDICATOR
 * @description A segment specifying general indicators related to the remuneration.
 */

@TagName("GIS")
@Data
public class GeneralIndicator {

@Mandatory
private ProcessingIndicator processingIndicator;

}
