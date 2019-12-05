package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id DII
 * @name DIRECTORY IDENTIFICATION
 * @description A segment specifying the identity of the directory set and giving its language and maintenance operation.
 */

@TagName("DII")
@Data
public class DirectoryIdentification {

@Mandatory
@Length("0-9")
private String version;

@Mandatory
@Length("0-9")
private String release;

@Length("0-3")
private String directoryStatus;

@Length("0-2")
private String controlAgency;

@Length("0-3")
private String languageCoded;

@Length("0-3")
private String maintenanceOperationCoded;

}
