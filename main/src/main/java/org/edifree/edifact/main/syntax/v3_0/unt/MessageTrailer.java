package org.edifree.edifact.main.syntax.v3_0.unt;

import org.edifree.edifact.main.all.annotations.Length;
import org.edifree.edifact.main.all.annotations.Mandatory;
import org.edifree.edifact.main.all.annotations.TagName;
import org.edifree.edifact.main.all.custom_object.Decimal;
import lombok.Data;


@TagName("UNT")
@Data
public class MessageTrailer {

    @Mandatory
    @Length("0-6")
    private Decimal numberOfSegmentsInAMessage;
    @Mandatory
    @Length("0-14")
    private String messageReferenceNumber;
}
