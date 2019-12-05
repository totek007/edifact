package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C112
 * @name TERMS/TIME INFORMATION
 * @description Time details in payment terms.
 */

@Data
public class TermsTimeInformation {

@Mandatory
@Length("0-3")
private String paymentTimeReferenceCoded;

@Length("0-3")
private String timeRelationCoded;

@Length("0-3")
private String typeOfPeriodCoded;

@Length("0-3")
private Decimal numberOfPeriods;

}
