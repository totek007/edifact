package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id CPS
 * @name CONSIGNMENT PACKING SEQUENCE
 * @description A segment identifying the sequence in which packing of the consignment is presented, e.g. a pallet loaded with boxes.
 */

@TagName("CPS")
@Data
public class ConsignmentPackingSequence {

@Mandatory
@Length("0-12")
private String hierarchicalIdNumber;

@Length("0-12")
private String hierarchicalParentId;

@Length("0-3")
private String packagingLevelCoded;

}
