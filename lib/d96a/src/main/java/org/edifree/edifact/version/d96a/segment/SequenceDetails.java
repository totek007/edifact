package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id SEQ
 * @name SEQUENCE DETAILS
 * @description A segment which provides a sequence number for later reference to related services, products or beneficiaries.
 */

@TagName("SEQ")
@Data
public class SequenceDetails {

@Length("0-3")
private String statusIndicatorCoded;

private SequenceInformation sequenceInformation;

}
