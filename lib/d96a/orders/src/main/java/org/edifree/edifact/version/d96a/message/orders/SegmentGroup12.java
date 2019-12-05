package org.edifree.edifact.version.d96a.message.orders;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP12
 * @name SegmentGroup12
 * @description A group of segments identifying the packaging, physical dimensions and marks and numbers for goods referenced by the whole order.
 */

@Data
public class SegmentGroup12 {

@Mandatory
private PackageObject packageObject;

@MaxChild(5)
private List<Measurements> measurements = new EdifactList<>();

@MaxChild(5)
private List<SegmentGroup13> segmentGroup13 = new EdifactList<>();

}
