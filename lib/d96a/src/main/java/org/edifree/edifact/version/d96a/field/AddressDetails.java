package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C090
 * @name ADDRESS DETAILS
 * @description To specify the details of an address.
 */

@Data
public class AddressDetails {

@Mandatory
@Length("0-3")
private String addressFormatCoded;

@Mandatory
@Length("0-70")
private String addressComponent1;

@Length("0-70")
private String addressComponent2;

@Length("0-70")
private String addressComponent3;

@Length("0-70")
private String addressComponent4;

@Length("0-70")
private String addressComponent5;

}
