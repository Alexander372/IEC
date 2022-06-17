package com.example.iec.EVS.buffer;

import com.example.iec.EVS.com.EVS;
import com.example.iec.j60870.ASdu;

public class AsduToEVS {

    private final ASdu asdu;
    private final EVS evs;

    public AsduToEVS(ASdu asdu, EVS evs) {
        this.asdu = asdu;
        this.evs = evs;
    }
}
