package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id CST
 * @name CUSTOMS STATUS OF GOODS
 * @description A segment to specify goods in terms of customs identities.
 */

@TagName("CST")
@Data
public class CustomsStatusOfGoods {

@Length("0-5")
private Decimal goodsItemNumber;

private CustomsIdentityCodes customsIdentityCodes1;

private CustomsIdentityCodes customsIdentityCodes2;

private CustomsIdentityCodes customsIdentityCodes3;

private CustomsIdentityCodes customsIdentityCodes4;

private CustomsIdentityCodes customsIdentityCodes5;

}
