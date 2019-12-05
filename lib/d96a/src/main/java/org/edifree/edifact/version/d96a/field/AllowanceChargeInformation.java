package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C552
 * @name ALLOWANCE/CHARGE INFORMATION
 * @description Identification of allowance/charge information by number and/or code.
 */

@Data
public class AllowanceChargeInformation {

@Length("0-35")
private String allowanceOrChargeNumber;

@Length("0-3")
private String chargeAllowanceDescriptionCoded;

}
