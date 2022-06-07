package com.example.iec.j60870;

import com.example.iec.j60870.ie.IeQualifierOfInterrogation;

import java.io.IOException;
import java.net.InetAddress;

public class RealCLientCponnection {

    private final static int PORT = 2404;

    private String inetAddress;

    public RealCLientCponnection(String inetAddress)  {
        this.inetAddress = inetAddress;

    }


    public void conEst() throws Exception {
        try (Connection clientConnection = new ClientConnectionBuilder(inetAddress).setPort(PORT).build()) {

            clientConnection.startDataTransfer(new ClientEventListener());

            clientConnection.interrogation(255, CauseOfTransmission.ACTIVATION, new IeQualifierOfInterrogation(20));

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

