package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C780
 * @name VALUE LIST IDENTIFICATION C780
 * @description The identification of a coded or non coded value list.
 */

@Data
public class ValueListIdentificationC780 {

@Mandatory
@Length("0-35")
private String valueListIdentifier;

@Length("0-3")
private String identityNumberQualifier;

}
