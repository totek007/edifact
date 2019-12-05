package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C782
 * @name DATA SET IDENTIFICATION C782
 * @description The identification of a data set.
 */

@Data
public class DataSetIdentificationC782 {

@Mandatory
@Length("0-35")
private String dataSetIdentifier;

@Length("0-3")
private String identityNumberQualifier;

}
