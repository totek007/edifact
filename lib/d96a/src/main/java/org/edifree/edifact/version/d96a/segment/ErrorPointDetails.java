package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id ERP
 * @name ERROR POINT DETAILS
 * @description A segment identifying the location of an application error within another message.
 */

@TagName("ERP")
@Data
public class ErrorPointDetails {

@Mandatory
private ErrorPointDetailsC701 errorPointDetailsC701;

}
