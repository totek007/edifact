package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id EFI
 * @name EXTERNAL FILE LINK IDENTIFICATION
 * @description This segment will identify each file, that is part of the contractual document, by quoting their name and a number.
 */

@TagName("EFI")
@Data
public class ExternalFileLinkIdentification {

@Mandatory
private FileIdentification fileIdentification;

private FileDetails fileDetails;

@Length("0-6")
private String sequenceNumber;

}
