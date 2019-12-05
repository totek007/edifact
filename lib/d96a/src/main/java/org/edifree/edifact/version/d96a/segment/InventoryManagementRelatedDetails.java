package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id INV
 * @name INVENTORY MANAGEMENT RELATED DETAILS
 * @description A segment identifying all the parameters required for a full stock activity report.
 */

@TagName("INV")
@Data
public class InventoryManagementRelatedDetails {

@Length("0-3")
private String inventoryMovementDirectionCoded;

@Length("0-3")
private String typeOfInventoryAffectedCoded;

@Length("0-3")
private String reasonForInventoryMovementCoded;

@Length("0-3")
private String inventoryBalanceMethodCoded;

private Instruction instruction;

}
