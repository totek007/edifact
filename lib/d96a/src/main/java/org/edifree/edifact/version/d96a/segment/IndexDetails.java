package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id IND
 * @name INDEX DETAILS
 * @description A segment giving the index value relevant to the period described in the current group.
 */

@TagName("IND")
@Data
public class IndexDetails {

private IndexIdentification indexIdentification;

private IndexValue indexValue;

}
