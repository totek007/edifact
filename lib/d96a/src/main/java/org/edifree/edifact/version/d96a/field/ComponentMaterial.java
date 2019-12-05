package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C824
 * @name COMPONENT MATERIAL
 * @description To identify the material of which a component is composed (e.g. steel, plastics).
 */

@Data
public class ComponentMaterial {

@Length("0-3")
private String componentMaterialCoded;

@Length("0-3")
private String codeListQualifier;

@Length("0-3")
private String codeListResponsibleAgencyCoded;

@Length("0-35")
private String componentMaterial;

}
