package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C701
 * @name ERROR POINT DETAILS C701
 * @description Indication of the point of error in a message.
 */

@Data
public class ErrorPointDetailsC701 {

@Mandatory
@Length("0-3")
private String messageSectionCoded;

@Length("0-35")
private String messageItemNumber;

@Length("0-6")
private Decimal messageSubitemNumber;

}
