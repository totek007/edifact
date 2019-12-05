package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id AGR
 * @name AGREEMENT IDENTIFICATION
 * @description This segment will be used to identify the 'type of contract and form of tender' that apply to this contract.
 */

@TagName("AGR")
@Data
public class AgreementIdentification {

private AgreementTypeIdentification agreementTypeIdentification;

@Length("0-3")
private String serviceLayerCoded;

}
