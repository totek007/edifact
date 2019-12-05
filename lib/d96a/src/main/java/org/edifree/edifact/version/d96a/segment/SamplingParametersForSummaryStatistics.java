package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id SPS
 * @name SAMPLING PARAMETERS FOR SUMMARY STATISTICS
 * @description A segment to define the sampling parameters associated with summary statistics reported. If used in this position, the values only apply to data within the same analysis group.
 */

@TagName("SPS")
@Data
public class SamplingParametersForSummaryStatistics {

private FrequencyDetails frequencyDetails;

@Length("0-6")
private Decimal confidenceLimit;

private SizeDetails sizeDetails1;

private SizeDetails sizeDetails2;

private SizeDetails sizeDetails3;

private SizeDetails sizeDetails4;

private SizeDetails sizeDetails5;

}
