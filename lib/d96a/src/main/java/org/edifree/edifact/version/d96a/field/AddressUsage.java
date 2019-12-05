package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C817
 * @name ADDRESS USAGE
 * @description To describe the usage of an address.
 */

@Data
public class AddressUsage {

@Length("0-3")
private String addressPurposeCoded;

@Length("0-3")
private String addressTypeCoded;

@Length("0-3")
private String addressStatusCoded;

}
