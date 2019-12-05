package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C273
 * @name ITEM DESCRIPTION C273
 * @description Description of an item.
 */

@Data
public class ItemDescriptionC273 {

@Length("0-17")
private String itemDescriptionIdentification;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-35")
private String itemDescription1;

@Length("0-35")
private String itemDescription2;

@Length("0-3")
private String languageCoded;

}
