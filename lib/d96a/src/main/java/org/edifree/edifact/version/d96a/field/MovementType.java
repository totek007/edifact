package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C219
 * @name MOVEMENT TYPE
 * @description Description of type of service for movement of cargo.
 */

@Data
public class MovementType {

@Length("0-3")
private String movementTypeCoded;

@Length("0-35")
private String movementType;

}
