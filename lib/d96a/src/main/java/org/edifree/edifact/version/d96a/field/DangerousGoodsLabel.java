package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C236
 * @name DANGEROUS GOODS LABEL
 * @description Markings identifying the type of hazardous goods and similar information.
 */

@Data
public class DangerousGoodsLabel {

@Length("0-4")
private String dangerousGoodsLabelMarking1;

@Length("0-4")
private String dangerousGoodsLabelMarking2;

@Length("0-4")
private String dangerousGoodsLabelMarking3;

}
