package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C246
 * @name CUSTOMS IDENTITY CODES
 * @description Specification of goods in terms of customs identity.
 */

@Data
public class CustomsIdentityCodes {

@Mandatory
@Length("0-18")
private String customsCodeIdentification;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

}
