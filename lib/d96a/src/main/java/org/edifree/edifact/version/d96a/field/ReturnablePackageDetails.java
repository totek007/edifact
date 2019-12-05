package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C532
 * @name RETURNABLE PACKAGE DETAILS
 * @description Indication of responsibility for payment and load contents of returnable packages.
 */

@Data
public class ReturnablePackageDetails {

@Length("0-3")
private String returnablePackageFreightPaymentResponsibilityCoded;

@Length("0-3")
private String returnablePackageLoadContentsCoded;

}
