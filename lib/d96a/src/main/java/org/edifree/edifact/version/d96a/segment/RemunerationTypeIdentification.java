package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id SAL
 * @name REMUNERATION TYPE IDENTIFICATION
 * @description A segment identifying the type of the remuneration and, if required, the name of the remuneration type or contract.
 */

@TagName("SAL")
@Data
public class RemunerationTypeIdentification {

private RemunerationTypeIdentificationC049 remunerationTypeIdentificationC049;

}
