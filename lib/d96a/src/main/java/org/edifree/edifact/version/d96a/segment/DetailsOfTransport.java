package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id TDT
 * @name DETAILS OF TRANSPORT
 * @description A segment to identify the transport details of the departing vessel.
 */

@TagName("TDT")
@Data
public class DetailsOfTransport {

@Mandatory
@Length("0-3")
private String transportStageQualifier;

@Length("0-17")
private String conveyanceReferenceNumber;

private ModeOfTransport modeOfTransport;

private TransportMeans transportMeans;

private Carrier carrier;

@Length("0-3")
private String transitDirectionCoded;

private ExcessTransportationInformation excessTransportationInformation;

private TransportIdentification transportIdentification;

@Length("0-3")
private String transportOwnershipCoded;

}
