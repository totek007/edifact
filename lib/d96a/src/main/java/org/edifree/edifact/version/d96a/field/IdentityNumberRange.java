package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C208
 * @name IDENTITY NUMBER RANGE
 * @description Goods item identification numbers, start and end of consecutively numbered range.
 */

@Data
public class IdentityNumberRange {

@Mandatory
@Length("0-35")
private String identityNumber1;

@Length("0-35")
private String identityNumber2;

}
