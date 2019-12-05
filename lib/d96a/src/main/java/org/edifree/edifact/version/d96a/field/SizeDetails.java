package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C512
 * @name SIZE DETAILS
 * @description Information about the number of observations.
 */

@Data
public class SizeDetails {

@Length("0-3")
private String sizeQualifier;

@Length("0-15")
private Decimal size;

}
