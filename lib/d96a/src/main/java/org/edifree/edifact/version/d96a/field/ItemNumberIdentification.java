package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C212
 * @name ITEM NUMBER IDENTIFICATION
 * @description Goods identification for a specified source.
 */

@Data
public class ItemNumberIdentification {

@Length("0-35")
private String itemNumber;

@Length("0-3")
private String itemNumberTypeCoded;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

}
