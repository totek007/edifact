package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C288
 * @name PRODUCT GROUP
 * @description To give product group information.
 */

@Data
public class ProductGroup {

@Length("0-3")
private String productGroupCoded;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-35")
private String productGroup;

}
