package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C506
 * @name REFERENCE C506
 * @description Identification of a reference.
 */

@Data
public class ReferenceC506 {

@Mandatory
@Length("0-3")
private String referenceQualifier;

@Length("0-35")
private String referenceNumber;

@Length("0-6")
private String lineNumber;

@Length("0-35")
private String referenceVersionNumber;

}
