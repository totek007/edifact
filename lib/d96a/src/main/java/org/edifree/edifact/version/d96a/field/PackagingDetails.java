package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C531
 * @name PACKAGING DETAILS
 * @description Packaging level and details, terms and conditions.
 */

@Data
public class PackagingDetails {

@Length("0-3")
private String packagingLevelCoded;

@Length("0-3")
private String packagingRelatedInformationCoded;

@Length("0-3")
private String packagingTermsAndConditionsCoded;

}
