package org.edifree.edifact.version.d96a.message.invoic;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP23
 * @name SegmentGroup23
 * @description A segment group to give information about adjustment.
 */

@Data
public class SegmentGroup23 {

@Mandatory
private AdjustmentDetails adjustmentDetails;

@MaxChild(5)
private List<FreeText> freeText = new EdifactList<>();

}
