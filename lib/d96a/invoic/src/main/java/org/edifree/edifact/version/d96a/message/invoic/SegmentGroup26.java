package org.edifree.edifact.version.d96a.message.invoic;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP26
 * @name SegmentGroup26
 * @description A group of segments specifying any monetary amounts relating to the products and when necessary a currency.
 */

@Data
public class SegmentGroup26 {

@Mandatory
private MonetaryAmount monetaryAmount;

private Currencies currencies;

}
