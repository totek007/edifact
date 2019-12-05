package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C059
 * @name STREET
 * @description Street address and/or PO Box number in a structured address: one to three lines.
 */

@Data
public class Street {

@Mandatory
@Length("0-35")
private String streetAndNumberPoBox1;

@Length("0-35")
private String streetAndNumberPoBox2;

@Length("0-35")
private String streetAndNumberPoBox3;

@Length("0-35")
private String streetAndNumberPoBox4;

}
