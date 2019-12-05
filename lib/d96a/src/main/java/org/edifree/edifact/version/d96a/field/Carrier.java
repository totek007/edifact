package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C040
 * @name CARRIER
 * @description Identification of a carrier by code and/or by name. Code preferred.
 */

@Data
public class Carrier {

@Length("0-17")
private String carrierIdentification;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-35")
private String carrierName;

}
