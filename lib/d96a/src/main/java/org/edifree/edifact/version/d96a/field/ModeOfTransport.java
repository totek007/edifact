package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C220
 * @name MODE OF TRANSPORT
 * @description Method of transport code or name. Code preferred.
 */

@Data
public class ModeOfTransport {

@Length("0-3")
private String modeOfTransportCoded;

@Length("0-17")
private String modeOfTransport;

}
