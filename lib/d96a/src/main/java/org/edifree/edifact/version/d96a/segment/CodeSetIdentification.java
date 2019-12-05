package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id CDS
 * @name CODE SET IDENTIFICATION
 * @description A segment specifying a code set. In DIRDEF data element 9434 shall not be used.
 */

@TagName("CDS")
@Data
public class CodeSetIdentification {

@Mandatory
private CodeSetIdentificationC702 codeSetIdentificationC702;

@Length("0-3")
private String classDesignatorCoded;

@Length("0-3")
private String maintenanceOperationCoded;

}
