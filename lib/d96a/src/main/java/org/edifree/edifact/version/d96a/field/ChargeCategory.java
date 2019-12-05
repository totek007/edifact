package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C229
 * @name CHARGE CATEGORY
 * @description Identification of a category or a zone of charges.
 */

@Data
public class ChargeCategory {

@Mandatory
@Length("0-3")
private String chargeCategoryCoded;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

}
