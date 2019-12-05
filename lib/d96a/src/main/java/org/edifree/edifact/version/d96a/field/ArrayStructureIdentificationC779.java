package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C779
 * @name ARRAY STRUCTURE IDENTIFICATION C779
 * @description The identification of an array structure.
 */

@Data
public class ArrayStructureIdentificationC779 {

@Mandatory
@Length("0-35")
private String arrayStructureIdentifier;

@Length("0-3")
private String identityNumberQualifier;

}
