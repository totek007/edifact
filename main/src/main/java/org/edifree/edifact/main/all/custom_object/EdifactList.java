/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.edifree.edifact.main.all.custom_object;

import java.util.ArrayList;

/**
 *
 * @author Rafal Paszkowski
 * @param <E>
 */

//@Slf4j
public class EdifactList<E> extends ArrayList<E> {

    public void runIfPrevNotEmpty(Runnable r){
        try {
            if (this.isEmpty()) {
                r.run();
            }
            while (!ObjectHelper.objectIsEmpty(this.get(this.size() - 1))) {
                r.run();
            }
        } catch (IllegalArgumentException | IllegalAccessException ex) {
            //log.error("EdifactList exception", ex);
            //Logger.getLogger(EdifactList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
