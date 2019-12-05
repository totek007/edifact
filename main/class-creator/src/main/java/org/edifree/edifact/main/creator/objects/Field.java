package org.edifree.edifact.main.creator.objects;


import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Field implements MapInterface {
    private String id;
    private String name;
    private String description;
    private List<Component> list=new ArrayList<>();
    private boolean isMandatory;

}
