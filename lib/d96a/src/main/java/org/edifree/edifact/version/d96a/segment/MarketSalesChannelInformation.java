package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id MKS
 * @name MARKET/SALES CHANNEL INFORMATION
 * @description To identify market and sales channel details for products and services information.
 */

@TagName("MKS")
@Data
public class MarketSalesChannelInformation {

@Mandatory
@Length("0-3")
private String sectorSubjectIdentificationQualifier;

@Mandatory
private SalesChannelIdentification salesChannelIdentification;

@Length("0-3")
private String actionRequestNotificationCoded;

}
