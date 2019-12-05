package org.edifree.edifact.version.d96a.message.invoic;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP29
 * @name SegmentGroup29
 * @description A group giving references and where necessary, their dates, relating to the line item.
 */

@Data
public class SegmentGroup29 {

@Mandatory
private Reference reference;

@MaxChild(5)
private List<DateTimePeriod> dateTimePeriod = new EdifactList<>();

}
