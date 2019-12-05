package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C703
 * @name NATURE OF CARGO C703
 * @description Rough classification of a type of cargo.
 */

@Data
public class NatureOfCargoC703 {

@Mandatory
@Length("0-3")
private String natureOfCargoCoded;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

}
