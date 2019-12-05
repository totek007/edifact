package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C953
 * @name CONTRIBUTION TYPE
 * @description Identification of the type of a contribution to a scheme or group.
 */

@Data
public class ContributionType {

@Mandatory
@Length("0-3")
private String contributionTypeCoded;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-35")
private String contributionType;

}
