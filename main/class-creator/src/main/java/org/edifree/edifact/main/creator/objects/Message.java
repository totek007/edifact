package org.edifree.edifact.main.creator.objects;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Message {
    private String version;
    private String type;
    private String pathSourceFile;
    private List<Object> list=new ArrayList<>();
}
