package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id ICD
 * @name INSURANCE COVER DESCRIPTION
 * @description A segment specifying the type of insurance as totalization criterion.
 */

@TagName("ICD")
@Data
public class InsuranceCoverDescription {

@Mandatory
private InsuranceCoverType insuranceCoverType;

@Mandatory
private InsuranceCoverDetails insuranceCoverDetails;

}
