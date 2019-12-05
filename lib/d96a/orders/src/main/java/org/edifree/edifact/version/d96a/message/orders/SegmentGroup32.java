package org.edifree.edifact.version.d96a.message.orders;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP32
 * @name SegmentGroup32
 * @description A group of segments specifying the markings and labels on individual physical units.
 */

@Data
public class SegmentGroup32 {

@Mandatory
private PackageIdentification packageIdentification;

private Reference reference;

@MaxChild(5)
private List<DateTimePeriod> dateTimePeriod = new EdifactList<>();

@MaxChild(10)
private List<GoodsIdentityNumber> goodsIdentityNumber = new EdifactList<>();

}
