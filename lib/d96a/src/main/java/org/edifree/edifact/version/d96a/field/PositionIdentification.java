package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C778
 * @name POSITION IDENTIFICATION
 * @description To identify the position of an object in a structure containing the object.
 */

@Data
public class PositionIdentification {

@Length("0-12")
private String hierarchicalIdNumber;

@Length("0-6")
private String sequenceNumber;

}
