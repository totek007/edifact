package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id GOR
 * @name GOVERNMENTAL REQUIREMENTS
 * @description A segment to indicate applicable governmental procedures related to import, export and transport of the goods item.
 */

@TagName("GOR")
@Data
public class GovernmentalRequirements {

@Length("0-3")
private String transportMovementCoded;

private GovernmentAction governmentAction1;

private GovernmentAction governmentAction2;

private GovernmentAction governmentAction3;

private GovernmentAction governmentAction4;

}
