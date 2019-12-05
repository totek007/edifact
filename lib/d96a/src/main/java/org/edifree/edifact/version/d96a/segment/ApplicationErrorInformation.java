package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id ERC
 * @name APPLICATION ERROR INFORMATION
 * @description A segment identifying the type of application errors within a message.
 */

@TagName("ERC")
@Data
public class ApplicationErrorInformation {

@Mandatory
private ApplicationErrorDetail applicationErrorDetail;

}
