package org.edifree.edifact.version.d96a.message.orders;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP52
 * @name SegmentGroup52
 * @description A group of segments indicating information (quantity and amount) for the calculation of the amortization.
 */

@Data
public class SegmentGroup52 {

@Mandatory
private Stages stages;

@MaxChild(3)
private List<SegmentGroup53> segmentGroup53 = new EdifactList<>();

}
