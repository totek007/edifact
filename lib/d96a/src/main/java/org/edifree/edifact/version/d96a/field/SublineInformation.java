package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C829
 * @name SUB-LINE INFORMATION
 * @description To provide an indication that a segment or segment group is used to contain sub-line or sub-line item information and to optionally enable the sub-line to be identified.
 */

@Data
public class SublineInformation {

@Length("0-3")
private String sublineIndicatorCoded;

@Length("0-6")
private Decimal lineItemNumber;

}
