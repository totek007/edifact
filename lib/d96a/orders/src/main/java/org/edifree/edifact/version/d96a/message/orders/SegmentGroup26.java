package org.edifree.edifact.version.d96a.message.orders;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP26
 * @name SegmentGroup26
 * @description A group of segments providing product characteristic and product characteristic details.
 */

@Data
public class SegmentGroup26 {

@Mandatory
private CharacteristicClassId characteristicClassId;

@MaxChild(10)
private List<CharacteristicValue> characteristicValue = new EdifactList<>();

@MaxChild(10)
private List<Measurements> measurements = new EdifactList<>();

}
