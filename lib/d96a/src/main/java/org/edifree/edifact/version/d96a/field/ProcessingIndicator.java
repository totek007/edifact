package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C529
 * @name PROCESSING INDICATOR
 * @description Type of process indication.
 */

@Data
public class ProcessingIndicator {

@Mandatory
@Length("0-3")
private String processingIndicatorCoded;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-17")
private String processTypeIdentification;

}
