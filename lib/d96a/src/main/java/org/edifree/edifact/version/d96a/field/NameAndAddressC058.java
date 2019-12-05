package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C058
 * @name NAME AND ADDRESS C058
 * @description Unstructured name and address: one to five lines.
 */

@Data
public class NameAndAddressC058 {

@Mandatory
@Length("0-35")
private String nameAndAddressLine1;

@Length("0-35")
private String nameAndAddressLine2;

@Length("0-35")
private String nameAndAddressLine3;

@Length("0-35")
private String nameAndAddressLine4;

@Length("0-35")
private String nameAndAddressLine5;

}
