package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id GID
 * @name GOODS ITEM DETAILS
 * @description A segment to identify the number of packages of the goods.
 */

@TagName("GID")
@Data
public class GoodsItemDetails {

@Length("0-5")
private Decimal goodsItemNumber;

private NumberAndTypeOfPackages numberAndTypeOfPackages1;

private NumberAndTypeOfPackages numberAndTypeOfPackages2;

private NumberAndTypeOfPackages numberAndTypeOfPackages3;

}
