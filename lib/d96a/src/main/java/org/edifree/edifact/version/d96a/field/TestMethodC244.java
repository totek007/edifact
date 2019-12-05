package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C244
 * @name TEST METHOD C244
 * @description Specification of the test method employed.
 */

@Data
public class TestMethodC244 {

@Length("0-17")
private String testMethodIdentification;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-70")
private String testDescription;

}
