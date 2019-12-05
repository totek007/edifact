package org.edifree.edifact.main.creator.objects;

import lombok.Data;

@Data
public class Component implements MapInterface {
    private String id;
    private String name;
    private String type;
    private String description;
    private int maxLength;
    private int minLength;
    private boolean isMandatory;
}
