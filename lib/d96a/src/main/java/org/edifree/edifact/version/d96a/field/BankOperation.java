package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C551
 * @name BANK OPERATION
 * @description Identification of a bank operation by code.
 */

@Data
public class BankOperation {

@Mandatory
@Length("0-3")
private String bankOperationCoded;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

}
