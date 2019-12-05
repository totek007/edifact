package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id RFF
 * @name REFERENCE
 * @description A segment for specifying references relevant to a work grant request, e.g. social insurance number of the foreigner.
 */

@TagName("RFF")
@Data
public class Reference {

@Mandatory
private ReferenceC506 referenceC506;

}
