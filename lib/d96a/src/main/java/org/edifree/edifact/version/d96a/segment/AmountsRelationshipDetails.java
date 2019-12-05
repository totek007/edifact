package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id ARD
 * @name AMOUNTS RELATIONSHIP DETAILS
 * @description A segment to qualify the monetary amount as to it's purpose in the business exchange.
 */

@TagName("ARD")
@Data
public class AmountsRelationshipDetails {

private MonetaryFunction monetaryFunction;

}
