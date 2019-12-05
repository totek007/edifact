package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C402
 * @name PACKAGE TYPE IDENTIFICATION
 * @description Identification of the form in which goods are described.
 */

@Data
public class PackageTypeIdentification {

@Mandatory
@Length("0-3")
private String itemDescriptionTypeCoded;

@Mandatory
@Length("0-35")
private String typeOfPackages1;

@Length("0-3")
private String itemNumberTypeCoded1;

@Length("0-35")
private String typeOfPackages2;

@Length("0-3")
private String itemNumberTypeCoded2;

}
