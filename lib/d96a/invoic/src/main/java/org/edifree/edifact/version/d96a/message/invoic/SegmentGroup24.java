package org.edifree.edifact.version.d96a.message.invoic;

import org.edifree.edifact.main.all.annotations.*;
import org.edifree.edifact.main.all.custom_object.*;
import org.edifree.edifact.version.d96a.segment.*;
import java.util.List;
import lombok.Data;

/**
 *
 * @id GRP24
 * @name SegmentGroup24
 * @description A segment group giving the possibility in a reply to INVOIC of instructing the other party of the action to be taken.
 */

@Data
public class SegmentGroup24 {

@Mandatory
private PartiesToInstruction partiesToInstruction;

@MaxChild(5)
private List<FreeText> freeText = new EdifactList<>();

}
