package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C242
 * @name PROCESS TYPE AND DESCRIPTION
 * @description Identification of process type and description.
 */

@Data
public class ProcessTypeAndDescription {

@Mandatory
@Length("0-17")
private String processTypeIdentification;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-35")
private String processType1;

@Length("0-35")
private String processType2;

}
