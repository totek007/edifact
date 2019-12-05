package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id MSG
 * @name MESSAGE TYPE IDENTIFICATION
 * @description A segment identifying a message type to be specified.
 */

@TagName("MSG")
@Data
public class MessageTypeIdentification {

@Mandatory
private MessageIdentifier messageIdentifier;

@Length("0-3")
private String classDesignatorCoded;

@Length("0-3")
private String maintenanceOperationCoded;

}
