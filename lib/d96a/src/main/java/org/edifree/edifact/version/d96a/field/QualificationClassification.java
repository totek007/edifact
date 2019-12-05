package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C950
 * @name QUALIFICATION CLASSIFICATION
 * @description Qualification classification description and/or code. This specifies the trade, skill, professional or similar qualification category.
 */

@Data
public class QualificationClassification {

@Length("0-3")
private String qualificationClassificationCoded;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-35")
private String qualificationClassification1;

@Length("0-35")
private String qualificationClassification2;

}
