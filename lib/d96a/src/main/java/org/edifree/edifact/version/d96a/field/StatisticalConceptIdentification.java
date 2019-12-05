package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C785
 * @name STATISTICAL CONCEPT IDENTIFICATION
 * @description The identification of a statistical concept.
 */

@Data
public class StatisticalConceptIdentification {

@Mandatory
@Length("0-35")
private String statisticalConceptIdentifier;

@Length("0-3")
private String identityNumberQualifier;

}
