package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id DLI
 * @name DOCUMENT LINE IDENTIFICATION
 * @description A segment identifying a specific line item within the referenced document.
 */

@TagName("DLI")
@Data
public class DocumentLineIdentification {

@Mandatory
@Length("0-3")
private String documentLineIndicatorCoded;

@Mandatory
@Length("0-6")
private Decimal lineItemNumber;

}
