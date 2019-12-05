package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id ALI
 * @name ADDITIONAL INFORMATION
 * @description A segment indicating that the line item is subject to special conditions owing to origin, customs preference, embargo regulations or commercial factors. In the Sales Data Report the ALI segment can be used to specify promotional flags, e.g. to indicate what type of promotion if any was in effect when the product specified in LIN was sold.
 */

@TagName("ALI")
@Data
public class AdditionalInformation {

@Length("0-3")
private String countryOfOriginCoded;

@Length("0-3")
private String typeOfDutyRegimeCoded;

@Length("0-3")
private String specialConditionsCoded1;

@Length("0-3")
private String specialConditionsCoded2;

@Length("0-3")
private String specialConditionsCoded3;

@Length("0-3")
private String specialConditionsCoded4;

@Length("0-3")
private String specialConditionsCoded5;

}
