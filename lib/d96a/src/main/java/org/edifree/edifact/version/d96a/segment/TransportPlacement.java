package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id TPL
 * @name TRANSPORT PLACEMENT
 * @description A segment to identify transport details for the equipment.
 */

@TagName("TPL")
@Data
public class TransportPlacement {

@Mandatory
private TransportIdentification transportIdentification;

}
