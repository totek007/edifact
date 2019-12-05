package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C076
 * @name COMMUNICATION CONTACT C076
 * @description Communication number of a department or employee in a specified channel.
 */

@Data
public class CommunicationContactC076 {

@Mandatory
@Length("0-512")
private String communicationNumber;

@Mandatory
@Length("0-3")
private String communicationChannelQualifier;

}
