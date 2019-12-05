package org.edifree.edifact.main.syntax.v4_1.unz;

import org.edifree.edifact.main.all.annotations.Length;
import org.edifree.edifact.main.all.annotations.Mandatory;
import org.edifree.edifact.main.all.annotations.TagName;
import org.edifree.edifact.main.all.custom_object.Decimal;
import lombok.Data;

@Data
@TagName("UNZ")
public class InterchangeTrailer {

    @Length("0-6")
    @Mandatory
    private Decimal interchangeControlCount;

    @Length("0-14")
    @Mandatory
    private String interchangeControlReference;
}
