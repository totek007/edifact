package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C332
 * @name SALES CHANNEL IDENTIFICATION
 * @description Identification of sales channel for marketing data, sales, forecast, planning...
 */

@Data
public class SalesChannelIdentification {

@Mandatory
@Length("0-17")
private String salesChannelIdentifier;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

}
