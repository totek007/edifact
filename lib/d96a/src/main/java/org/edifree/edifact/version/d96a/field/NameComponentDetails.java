package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C816
 * @name NAME COMPONENT DETAILS
 * @description To specify a name component.
 */

@Data
public class NameComponentDetails {

@Mandatory
@Length("0-3")
private String nameComponentQualifier;

@Length("0-70")
private String nameComponent;

@Length("0-3")
private String nameComponentStatusCoded;

@Length("0-3")
private String nameComponentOriginalRepresentationCoded;

}
