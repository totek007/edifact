package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id TEM
 * @name TEST METHOD
 * @description A segment specifying the type and nature of the test performed to obtain the measurement.
 */

@TagName("TEM")
@Data
public class TestMethod {

private TestMethodC244 testMethodC244;

@Length("0-3")
private String testRouteOfAdministeringCoded;

@Length("0-3")
private String testMediaCoded;

@Length("0-3")
private String measurementApplicationQualifier;

@Length("0-30")
private String testRevisionNumber;

private TestReason testReason;

}
