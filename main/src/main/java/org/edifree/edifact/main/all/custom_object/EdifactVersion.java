/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.edifree.edifact.main.all.custom_object;

import org.edifree.edifact.main.all.exception.EdifactLibraryException;

/**
 *
 * @author Rafal Paszkowski
 */

public enum EdifactVersion {
    D42,D911,D912,D921,D932,D93A,S93A,D94A,D94B,D95A,D95B,D96A,D96B,D97A,D97B,D98A,D98B,D99A,D99B,D00A,D00B,D01A,D01B,D01C,D02A,D02B,D03A,D03B,D04A,D04B,D05A,D05B,D06A,D06B,D07A,D07B,D08A,D08B,D09A,D09B,D10A,D10B,D11A,D11B,D12A,D12B,D13A,D13B,D14A,D14B,D15A,D15B,D16A,D16B;

    EdifactVersion() {
    }

    public static EdifactVersion create(String edifactVersion) throws EdifactLibraryException {
        for(EdifactVersion e:EdifactVersion.values()){
            if(e.name().trim().equalsIgnoreCase(edifactVersion)){
                return e;
            }
        }
        //log. TODO !!!!
        throw new EdifactLibraryException("Can not create edifact version. No text found:"+edifactVersion);
    }
}
