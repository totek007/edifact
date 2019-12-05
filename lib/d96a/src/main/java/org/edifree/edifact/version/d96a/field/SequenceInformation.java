package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C286
 * @name SEQUENCE INFORMATION
 * @description Identification of a sequence and source for sequencing.
 */

@Data
public class SequenceInformation {

@Mandatory
@Length("0-6")
private String sequenceNumber;

@Length("0-3")
private String sequenceNumberSourceCoded;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

}
