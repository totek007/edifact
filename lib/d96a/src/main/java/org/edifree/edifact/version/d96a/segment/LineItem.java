package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id LIN
 * @name LINE ITEM
 * @description A segment identifying the line item by the line number and configuration level, and additionally identifying the product or service that has been sold.
 */

@TagName("LIN")
@Data
public class LineItem {

@Length("0-6")
private Decimal lineItemNumber;

@Length("0-3")
private String actionRequestNotificationCoded;

private ItemNumberIdentification itemNumberIdentification;

private SublineInformation sublineInformation;

@Length("0-2")
private Decimal configurationLevel;

@Length("0-3")
private String configurationCoded;

}
