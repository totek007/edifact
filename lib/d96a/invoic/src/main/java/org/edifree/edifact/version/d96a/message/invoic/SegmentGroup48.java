package org.edifree.edifact.version.d96a.message.invoic;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP48
 * @name SegmentGroup48
 * @description A group of segments giving total amounts for the whole invoice and - if relevant -detailing amounts pre-paid with relevant references and dates-
 */

@Data
public class SegmentGroup48 {

@Mandatory
private MonetaryAmount monetaryAmount;

private SegmentGroup49 segmentGroup49;

}
