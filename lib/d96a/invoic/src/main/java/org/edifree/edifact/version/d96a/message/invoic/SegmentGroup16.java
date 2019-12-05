package org.edifree.edifact.version.d96a.message.invoic;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP16
 * @name SegmentGroup16
 * @description A group of segment for giving references and where necessary, their dates relating to the allowances or charges.
 */

@Data
public class SegmentGroup16 {

@Mandatory
private Reference reference;

@MaxChild(5)
private List<DateTimePeriod> dateTimePeriod = new EdifactList<>();

}
