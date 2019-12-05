package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C099
 * @name FILE DETAILS
 * @description To define details relevant to a file.
 */

@Data
public class FileDetails {

@Mandatory
@Length("0-17")
private String fileFormat;

@Length("0-9")
private String version;

@Length("0-3")
private String dataFormatCoded;

@Length("0-35")
private String dataFormat;

}
