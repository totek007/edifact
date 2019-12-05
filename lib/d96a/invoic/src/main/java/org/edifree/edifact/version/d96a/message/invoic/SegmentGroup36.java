package org.edifree.edifact.version.d96a.message.invoic;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP36
 * @name SegmentGroup36
 * @description A group of segments identifying the documentary requirements of the specified party.
 */

@Data
public class SegmentGroup36 {

@Mandatory
private DocumentMessageDetails documentMessageDetails;

@MaxChild(5)
private List<DateTimePeriod> dateTimePeriod = new EdifactList<>();

}
