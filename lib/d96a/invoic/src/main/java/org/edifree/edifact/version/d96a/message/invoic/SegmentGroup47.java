package org.edifree.edifact.version.d96a.message.invoic;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP47
 * @name SegmentGroup47
 * @description A group of segments identifying for the line item - where this is different to or not specified within the Heading section - any rules, laws or regulations with which the supplier must comply to meet requirements. e.g. building regulations, safety requirements etc.
 */

@Data
public class SegmentGroup47 {

@Mandatory
private RequirementsAndConditions requirementsAndConditions;

@MaxChild(5)
private List<Reference> reference = new EdifactList<>();

@MaxChild(5)
private List<DateTimePeriod> dateTimePeriod = new EdifactList<>();

@MaxChild(5)
private List<FreeText> freeText = new EdifactList<>();

}
