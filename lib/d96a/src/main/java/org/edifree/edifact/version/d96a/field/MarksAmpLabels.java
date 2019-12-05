package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C210
 * @name MARKS &amp; LABELS
 * @description Shipping marks on packages in free text; one to ten lines.
 */

@Data
public class MarksAmpLabels {

@Mandatory
@Length("0-35")
private String shippingMarks1;

@Length("0-35")
private String shippingMarks2;

@Length("0-35")
private String shippingMarks3;

@Length("0-35")
private String shippingMarks4;

@Length("0-35")
private String shippingMarks5;

@Length("0-35")
private String shippingMarks6;

@Length("0-35")
private String shippingMarks7;

@Length("0-35")
private String shippingMarks8;

@Length("0-35")
private String shippingMarks9;

@Length("0-35")
private String shippingMarks10;

}
