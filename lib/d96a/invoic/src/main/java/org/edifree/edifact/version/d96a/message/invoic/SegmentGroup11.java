package org.edifree.edifact.version.d96a.message.invoic;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP11
 * @name SegmentGroup11
 * @description A group of segments to allow reference to transport details.
 */

@Data
public class SegmentGroup11 {

@Mandatory
private Reference reference;

@MaxChild(5)
private List<DateTimePeriod> dateTimePeriod = new EdifactList<>();

}
