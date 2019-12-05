package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id TOD
 * @name TERMS OF DELIVERY OR TRANSPORT
 * @description A segment identifying the delivery terms to be used.
 */

@TagName("TOD")
@Data
public class TermsOfDeliveryOrTransport {

@Length("0-3")
private String termsOfDeliveryOrTransportFunctionCoded;

@Length("0-3")
private String transportChargesMethodOfPaymentCoded;

private TermsOfDeliveryOrTransportC100 termsOfDeliveryOrTransportC100;

}
