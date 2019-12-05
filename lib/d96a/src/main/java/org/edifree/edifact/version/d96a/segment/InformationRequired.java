package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id IRQ
 * @name INFORMATION REQUIRED
 * @description A segment to specify information to be supplied in the quotation.
 */

@TagName("IRQ")
@Data
public class InformationRequired {

@Mandatory
private InformationRequest informationRequest;

}
