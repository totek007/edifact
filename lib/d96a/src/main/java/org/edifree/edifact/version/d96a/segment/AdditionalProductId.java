package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id PIA
 * @name ADDITIONAL PRODUCT ID
 * @description A segment providing either additional identification to the product specified in the LIN segment or providing any substitute product identification. In the Sales Data Report the PIA segment can be used when a product specified in LIN has to be associated with a group or family of products whose identity could be specified in PIA.
 */

@TagName("PIA")
@Data
public class AdditionalProductId {

@Mandatory
@Length("0-3")
private String productIdFunctionQualifier;

@Mandatory
private ItemNumberIdentification itemNumberIdentification1;

private ItemNumberIdentification itemNumberIdentification2;

private ItemNumberIdentification itemNumberIdentification3;

private ItemNumberIdentification itemNumberIdentification4;

private ItemNumberIdentification itemNumberIdentification5;

}
