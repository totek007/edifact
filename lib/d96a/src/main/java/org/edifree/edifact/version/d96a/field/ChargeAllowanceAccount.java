package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C878
 * @name CHARGE/ALLOWANCE ACCOUNT
 * @description Identification of the account for charge or allowance.
 */

@Data
public class ChargeAllowanceAccount {

@Mandatory
@Length("0-17")
private String institutionBranchNumber;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-35")
private String accountHolderNumber;

@Length("0-3")
private String currencyCoded;

}
