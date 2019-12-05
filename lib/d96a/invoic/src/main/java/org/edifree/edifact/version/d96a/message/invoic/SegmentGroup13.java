package org.edifree.edifact.version.d96a.message.invoic;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP13
 * @name SegmentGroup13
 * @description A group of segments identifying the packaging, physical dimensions and marks and numbers for goods referenced by the whole invoice.
 */

@Data
public class SegmentGroup13 {

@Mandatory
private PackageObject packageObject;

@MaxChild(5)
private List<Measurements> measurements = new EdifactList<>();

@MaxChild(5)
private List<SegmentGroup14> segmentGroup14 = new EdifactList<>();

}
