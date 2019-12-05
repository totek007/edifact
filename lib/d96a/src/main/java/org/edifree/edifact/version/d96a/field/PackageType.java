package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C202
 * @name PACKAGE TYPE
 * @description Type of package by name or by code from a specified source.
 */

@Data
public class PackageType {

@Length("0-17")
private String typeOfPackagesIdentification;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-35")
private String typeOfPackages;

}
