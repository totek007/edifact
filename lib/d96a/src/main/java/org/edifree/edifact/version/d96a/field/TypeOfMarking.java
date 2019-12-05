package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C827
 * @name TYPE OF MARKING
 * @description Specification of the type of marking that reflects the method that was used and the conventions adhered to for marking (e.g. of packages).
 */

@Data
public class TypeOfMarking {

@Mandatory
@Length("0-3")
private String typeOfMarkingCoded;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

}
