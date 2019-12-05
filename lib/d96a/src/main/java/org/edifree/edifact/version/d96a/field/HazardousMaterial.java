package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C218
 * @name HAZARDOUS MATERIAL
 * @description Hazardous material code from a specified source.
 */

@Data
public class HazardousMaterial {

@Length("0-4")
private String hazardousMaterialClassCodeIdentification;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

}
