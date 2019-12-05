package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id COD
 * @name COMPONENT DETAILS
 * @description A segment to specify component details of the damaged equipment.
 */

@TagName("COD")
@Data
public class ComponentDetails {

private TypeOfUnitComponent typeOfUnitComponent;

private ComponentMaterial componentMaterial;

}
