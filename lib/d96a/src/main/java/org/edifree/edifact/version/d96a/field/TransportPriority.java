package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C537
 * @name TRANSPORT PRIORITY
 * @description To indicate the priority of requested transport service.
 */

@Data
public class TransportPriority {

@Mandatory
@Length("0-3")
private String transportPriorityCoded;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

}
