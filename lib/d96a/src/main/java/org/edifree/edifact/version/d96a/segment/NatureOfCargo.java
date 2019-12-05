package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id GDS
 * @name NATURE OF CARGO
 * @description A segment to describe the nature of the cargo.
 */

@TagName("GDS")
@Data
public class NatureOfCargo {

private NatureOfCargoC703 natureOfCargoC703;

}
