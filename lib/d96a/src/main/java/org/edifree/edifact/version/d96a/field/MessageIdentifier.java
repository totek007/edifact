package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C709
 * @name MESSAGE IDENTIFIER
 * @description Identification of the message.
 */

@Data
public class MessageIdentifier {

@Mandatory
@Length("0-6")
private String messageTypeIdentifier;

@Mandatory
@Length("0-9")
private String version;

@Mandatory
@Length("0-9")
private String release;

@Mandatory
@Length("0-2")
private String controlAgency;

@Length("0-6")
private String associationAssignedIdentification;

@Length("0-6")
private String revisionNumber;

}
