package org.edifree.edifact.main.creator.objects;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Group implements MapInterface {
    private String id;
    private String name;
    private String description;
    private boolean isMandatory;
    private int maxChild;
    private List<Object> list=new ArrayList<>();
}
