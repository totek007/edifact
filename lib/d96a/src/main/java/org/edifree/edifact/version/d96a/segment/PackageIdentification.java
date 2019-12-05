package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id PCI
 * @name PACKAGE IDENTIFICATION
 * @description A segment identifying markings and labels on packages relevant to the product item.
 */

@TagName("PCI")
@Data
public class PackageIdentification {

@Length("0-3")
private String markingInstructionsCoded;

private MarksAmpLabels marksAmpLabels;

@Length("0-3")
private String containerPackageStatusCoded;

private TypeOfMarking typeOfMarking;

}
