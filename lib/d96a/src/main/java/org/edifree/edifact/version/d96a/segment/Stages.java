package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id STG
 * @name STAGES
 * @description A segment providing information related to the kind of stage in a process, the total number of stages and the current stage.
 */

@TagName("STG")
@Data
public class Stages {

@Mandatory
@Length("0-3")
private String stagesQualifier;

@Length("0-2")
private Decimal numberOfStages;

@Length("0-2")
private Decimal actualStageCount;

}
