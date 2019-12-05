package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C823
 * @name TYPE OF UNIT/COMPONENT
 * @description To identify the type of unit/component of an object (e.g. lock, door, tyre).
 */

@Data
public class TypeOfUnitComponent {

@Length("0-3")
private String typeOfUnitComponentCoded;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-35")
private String typeOfUnitComponent;

}
