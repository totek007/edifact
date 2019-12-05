package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id BUS
 * @name BUSINESS FUNCTION
 * @description A segment identifying certain characteristics of the Payment Order, such as its business function. In so doing, it provides information about the message that may be used, for instance, for routing within an institution, for tariffing, or for the provision of some statistical information.
 */

@TagName("BUS")
@Data
public class BusinessFunction {

private BusinessFunctionC521 businessFunctionC521;

@Length("0-3")
private String geographicEnvironmentCoded;

@Length("0-3")
private String typeOfFinancialTransactionCoded;

private BankOperation bankOperation;

@Length("0-3")
private String intracompanyPaymentCoded;

}
