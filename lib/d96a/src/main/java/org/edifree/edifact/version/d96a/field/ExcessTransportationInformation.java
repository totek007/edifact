package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C401
 * @name EXCESS TRANSPORTATION INFORMATION
 * @description To provide details of reason for, and responsibility for, use of transportation other than normally utilized.
 */

@Data
public class ExcessTransportationInformation {

@Mandatory
@Length("0-3")
private String excessTransportationReasonCoded;

@Mandatory
@Length("0-3")
private String excessTransportationResponsibilityCoded;

@Length("0-17")
private String customerAuthorizationNumber;

}
