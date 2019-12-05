package org.edifree.edifact.version.d96a.message.invoic;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP2
 * @name SegmentGroup2
 * @description A group of segments identifying the parties with associated information.
 */

@Data
public class SegmentGroup2 {

@Mandatory
private NameAndAddress nameAndAddress;

@MaxChild(25)
private List<PlaceLocationIdentification> placeLocationIdentification = new EdifactList<>();

@MaxChild(5)
private List<FinancialInstitutionInformation> financialInstitutionInformation = new EdifactList<>();

@MaxChild(9999)
private List<SegmentGroup3> segmentGroup3 = new EdifactList<>();

@MaxChild(5)
private List<SegmentGroup4> segmentGroup4 = new EdifactList<>();

@MaxChild(5)
private List<SegmentGroup5> segmentGroup5 = new EdifactList<>();

}
