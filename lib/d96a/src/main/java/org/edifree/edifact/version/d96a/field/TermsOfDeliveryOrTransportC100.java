package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C100
 * @name TERMS OF DELIVERY OR TRANSPORT C100
 * @description Terms of delivery or transport code from a specified source.
 */

@Data
public class TermsOfDeliveryOrTransportC100 {

@Length("0-3")
private String termsOfDeliveryOrTransportCoded;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-70")
private String termsOfDeliveryOrTransport1;

@Length("0-70")
private String termsOfDeliveryOrTransport2;

}
