package org.edifree.edifact.version.d96a.message.invoic;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP8
 * @name SegmentGroup8
 * @description A group of segments specifying the terms of payment applicable for the whole invoice.
 */

@Data
public class SegmentGroup8 {

@Mandatory
private PaymentTermsBasis paymentTermsBasis;

@MaxChild(5)
private List<DateTimePeriod> dateTimePeriod = new EdifactList<>();

private PercentageDetails percentageDetails;

private MonetaryAmount monetaryAmount;

private PaymentInstructions paymentInstructions;

private FinancialInstitutionInformation financialInstitutionInformation;

}
