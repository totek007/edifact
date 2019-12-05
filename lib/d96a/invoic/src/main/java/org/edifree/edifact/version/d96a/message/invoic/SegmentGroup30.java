package org.edifree.edifact.version.d96a.message.invoic;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP30
 * @name SegmentGroup30
 * @description A group of segments identifying the packaging, physical dimensions, and marks and numbers for goods referenced in the line item.
 */

@Data
public class SegmentGroup30 {

@Mandatory
private PackageObject packageObject;

@MaxChild(10)
private List<Measurements> measurements = new EdifactList<>();

@MaxChild(10)
private List<SegmentGroup31> segmentGroup31 = new EdifactList<>();

}
