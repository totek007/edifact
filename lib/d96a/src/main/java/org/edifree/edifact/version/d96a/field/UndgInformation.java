package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C234
 * @name UNDG INFORMATION
 * @description Information on United Nations Dangerous Goods classification.
 */

@Data
public class UndgInformation {

@Length("4")
private Decimal undgNumber;

@Length("0-8")
private String dangerousGoodsFlashpoint;

}
