package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C546
 * @name INDEX VALUE
 * @description To identify the value of an index.
 */

@Data
public class IndexValue {

@Mandatory
@Length("0-6")
private Decimal indexValue;

@Length("0-3")
private String indexValueRepresentationCoded;

}
