package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id PSD
 * @name PHYSICAL SAMPLE DESCRIPTION
 * @description A segment to define the physical sample parameters associated with a test resulting in discrete measurements. If used in this position, the values only apply to data within the same analysis group.
 */

@TagName("PSD")
@Data
public class PhysicalSampleDescription {

@Length("0-3")
private String sampleProcessStatusCoded;

@Length("0-3")
private String sampleSelectionMethodCoded;

private FrequencyDetails frequencyDetails;

@Length("0-3")
private String sampleDescriptionCoded;

@Length("0-3")
private String sampleDirectionCoded;

private SampleLocationDetails sampleLocationDetails1;

private SampleLocationDetails sampleLocationDetails2;

private SampleLocationDetails sampleLocationDetails3;

}
