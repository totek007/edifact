package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C222
 * @name TRANSPORT IDENTIFICATION
 * @description Code and/or name identifying the means of transport.
 */

@Data
public class TransportIdentification {

@Length("0-9")
private String idOfMeansOfTransportIdentification;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-35")
private String idOfTheMeansOfTransport;

@Length("0-3")
private String nationalityOfMeansOfTransportCoded;

}
