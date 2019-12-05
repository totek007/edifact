package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id IMD
 * @name ITEM DESCRIPTION
 * @description A segment identifying a particular product or service.
 */

@TagName("IMD")
@Data
public class ItemDescription {

@Length("0-3")
private String itemDescriptionTypeCoded;

@Length("0-3")
private String itemCharacteristicCoded;

private ItemDescriptionC273 itemDescriptionC273;

@Length("0-3")
private String surfaceLayerIndicatorCoded;

}
