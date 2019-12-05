package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C077
 * @name FILE IDENTIFICATION
 * @description To identify a file.
 */

@Data
public class FileIdentification {

@Length("0-35")
private String fileName;

@Length("0-35")
private String itemDescription;

}
