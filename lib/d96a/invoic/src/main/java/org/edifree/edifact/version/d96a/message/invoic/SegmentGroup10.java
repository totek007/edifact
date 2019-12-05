package org.edifree.edifact.version.d96a.message.invoic;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP10
 * @name SegmentGroup10
 * @description A group of segments giving the location and date/time information relative to the transportation.
 */

@Data
public class SegmentGroup10 {

@Mandatory
private PlaceLocationIdentification placeLocationIdentification;

@MaxChild(5)
private List<DateTimePeriod> dateTimePeriod = new EdifactList<>();

}
