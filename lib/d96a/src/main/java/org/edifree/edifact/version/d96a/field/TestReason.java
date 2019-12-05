package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C515
 * @name TEST REASON
 * @description To identify the reason for the test as specified.
 */

@Data
public class TestReason {

@Length("0-17")
private String testReasonIdentification;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-35")
private String testReason;

}
