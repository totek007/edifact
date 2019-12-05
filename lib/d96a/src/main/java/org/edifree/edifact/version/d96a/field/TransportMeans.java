package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C228
 * @name TRANSPORT MEANS
 * @description Code and/or name identifying the type of means of transport.
 */

@Data
public class TransportMeans {

@Length("0-8")
private String typeOfMeansOfTransportIdentification;

@Length("0-17")
private String typeOfMeansOfTransport;

}
