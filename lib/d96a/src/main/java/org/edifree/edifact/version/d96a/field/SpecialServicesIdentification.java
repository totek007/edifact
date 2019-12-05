package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C214
 * @name SPECIAL SERVICES IDENTIFICATION
 * @description Identification of a special service by a code from a specified source or by description.
 */

@Data
public class SpecialServicesIdentification {

@Length("0-3")
private String specialServicesCoded;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-35")
private String specialService1;

@Length("0-35")
private String specialService2;

}
