package org.edifree.edifact.version.d96a.segment;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.field.*;
import lombok.Data;

/**
 *
 * @id PAC
 * @name PACKAGE
 * @description A segment specifying the number and type of packages.
 */

@TagName("PAC")
@Data
public class PackageObject {

@Length("0-8")
private Decimal numberOfPackages;

private PackagingDetails packagingDetails;

private PackageType packageType;

private PackageTypeIdentification packageTypeIdentification;

private ReturnablePackageDetails returnablePackageDetails;

}
