package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id TSR
 * @name TRANSPORT SERVICE REQUIREMENTS
 * @description A segment identifying the transport service relating to the consignment.
 */

@TagName("TSR")
@Data
public class TransportServiceRequirements {

private ContractAndCarriageCondition contractAndCarriageCondition;

private Service service;

private TransportPriority transportPriority;

private NatureOfCargo natureOfCargo;

}
