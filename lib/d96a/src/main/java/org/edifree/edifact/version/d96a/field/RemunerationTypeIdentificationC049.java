package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C049
 * @name REMUNERATION TYPE IDENTIFICATION C049
 * @description Identification of the type of a remuneration.
 */

@Data
public class RemunerationTypeIdentificationC049 {

@Length("0-3")
private String remunerationTypeCoded;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-35")
private String remunerationType1;

@Length("0-35")
private String remunerationType2;

}
