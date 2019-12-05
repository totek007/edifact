package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id CMP
 * @name COMPOSITE DATA ELEMENT IDENTIFICATION
 * @description A segment identifying a composite data element and specifying its class and maintenance operation.
 */

@TagName("CMP")
@Data
public class CompositeDataElementIdentification {

@Mandatory
@Length("0-4")
private String compositeDataElementTag;

@Length("0-3")
private String classDesignatorCoded;

@Length("0-3")
private String maintenanceOperationCoded;

}
