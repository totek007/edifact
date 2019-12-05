package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C213
 * @name NUMBER AND TYPE OF PACKAGES
 * @description Number and type of individual parts of a shipment.
 */

@Data
public class NumberAndTypeOfPackages {

@Length("0-8")
private Decimal numberOfPackages;

@Length("0-17")
private String typeOfPackagesIdentification;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-35")
private String typeOfPackages;

}
