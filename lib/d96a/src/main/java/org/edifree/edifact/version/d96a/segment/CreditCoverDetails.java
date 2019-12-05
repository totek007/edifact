package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id CCD
 * @name CREDIT COVER DETAILS
 * @description A segment specifying a request for a credit cover, a reply to that request and the reasons for the reply.
 */

@TagName("CCD")
@Data
public class CreditCoverDetails {

@Length("0-3")
private String creditCoverRequestCoded;

@Length("0-3")
private String creditCoverResponseCoded;

@Length("0-3")
private String creditCoverReasonCoded;

}
