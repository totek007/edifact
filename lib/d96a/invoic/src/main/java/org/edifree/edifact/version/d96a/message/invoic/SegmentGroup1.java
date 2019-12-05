package org.edifree.edifact.version.d96a.message.invoic;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP1
 * @name SegmentGroup1
 * @description A group of segments for giving references and where necessary, their dates, relating to the whole message, e.g. contract number, import/export license number, despatch advice number.
 */

@Data
public class SegmentGroup1 {

@Mandatory
private Reference reference;

@MaxChild(5)
private List<DateTimePeriod> dateTimePeriod = new EdifactList<>();

}
