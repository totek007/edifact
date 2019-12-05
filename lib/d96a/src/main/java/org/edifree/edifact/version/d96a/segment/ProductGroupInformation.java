package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id PGI
 * @name PRODUCT GROUP INFORMATION
 * @description A segment identifying the products Price/Tariff group where applicable.
 */

@TagName("PGI")
@Data
public class ProductGroupInformation {

@Mandatory
@Length("0-3")
private String productGroupTypeCoded;

private ProductGroup productGroup;

}
