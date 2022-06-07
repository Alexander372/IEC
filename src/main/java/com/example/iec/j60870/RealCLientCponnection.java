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

        Connection clientConnection = new ClientConnectionBuilder(inetAddress).setPort(PORT).build();

            ClientEventListener clientEventListener = new ClientEventListener();
            clientConnection.startDataTransfer(clientEventListener);

            clientConnection.setConnectionListener(clientEventListener);

            clientConnection.interrogation(3, CauseOfTransmission.ACTIVATION, new IeQualifierOfInterrogation(20));

            clientConnection.stopDataTransfer();
    }


    public static void main(String[] args) throws Exception {

        //SpringApplication.run(IecApplication.class, args);

        RealCLientCponnection realCLientCponnection = new RealCLientCponnection("127.0.0.1");
        realCLientCponnection.conEst();


    }

}

