package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id DSI
 * @name DATA SET IDENTIFICATION
 * @description A segment containing the unique identifier of the data set.
 */

@TagName("DSI")
@Data
public class DataSetIdentification {

@Mandatory
private DataSetIdentificationC782 dataSetIdentificationC782;

private PartyIdentificationDetails partyIdentificationDetails;

@Length("0-3")
private String statusCoded;

private SequenceInformation sequenceInformation;

@Length("0-6")
private String revisionNumber;

}
