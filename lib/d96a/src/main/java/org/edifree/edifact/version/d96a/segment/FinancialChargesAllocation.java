package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id FCA
 * @name FINANCIAL CHARGES ALLOCATION
 * @description A segment specifying the method for allocation of charges and allowances (e.g., charges borne by the Ordering Customer, the Beneficiary or both), and identifying the Ordering Customer's account to which such charges or allowances should be directed where it is different from the principal account.
 */

@TagName("FCA")
@Data
public class FinancialChargesAllocation {

@Mandatory
@Length("0-3")
private String settlementCoded;

private ChargeAllowanceAccount chargeAllowanceAccount;

}
