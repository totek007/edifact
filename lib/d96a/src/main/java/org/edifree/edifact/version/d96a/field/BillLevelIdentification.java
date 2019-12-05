package org.edifree.edifact.version.d96a.field;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import lombok.Data;

/**
 *
 * @id C045
 * @name BILL LEVEL IDENTIFICATION
 * @description A sequenced collection of facetted codes used for multiple indexing purposes.
 */

@Data
public class BillLevelIdentification {

@Length("0-17")
private String levelOneId;

@Length("0-17")
private String levelTwoId;

@Length("0-17")
private String levelThreeId;

@Length("0-17")
private String levelFourId;

@Length("0-17")
private String levelFiveId;

@Length("0-17")
private String levelSixId;

}
