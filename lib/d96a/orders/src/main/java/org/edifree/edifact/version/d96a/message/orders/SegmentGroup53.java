package org.edifree.edifact.version.d96a.message.orders;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP53
 * @name SegmentGroup53
 * @description A group of segment indicating quantity and monetary amount related to STG.
 */

@Data
public class SegmentGroup53 {

@Mandatory
private Quantity quantity;

private MonetaryAmount monetaryAmount;

}
