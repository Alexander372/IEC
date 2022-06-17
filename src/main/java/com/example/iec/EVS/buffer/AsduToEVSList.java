package com.example.iec.EVS.buffer;

import com.example.iec.j60870.ASdu;

import java.util.HashMap;
import java.util.Map;

public class AsduToEVSList {

   private Map<ASdu, AsduToEVS> asduToEVSlist;

    public AsduToEVSList() {
        this.asduToEVSlist = new HashMap<>();
    }


}
