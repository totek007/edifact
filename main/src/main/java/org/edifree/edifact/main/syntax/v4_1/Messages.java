/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.edifree.edifact.main.syntax.v4_1;

import org.edifree.edifact.main.all.annotations.MaxChild;
import org.edifree.edifact.main.all.custom_object.EdifactList;
import org.edifree.edifact.main.all.custom_object.MessageObject;
import org.edifree.edifact.main.all.annotations.Mandatory;
import java.util.List;

import lombok.Data;

/**
 *
 * @author Rafal Paszkowski
 */
@Data
public class Messages {
    
    @Mandatory
    @MaxChild(999999999)
    private final List<MessageObject> messageList=new EdifactList<MessageObject>();
    
}
