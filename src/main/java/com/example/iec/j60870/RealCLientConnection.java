package com.example.iec.j60870;

import com.example.iec.j60870.ie.IeQualifierOfInterrogation;

public class RealCLientConnection {

    private final static int PORT = 2404;

    private String inetAddress;

    public RealCLientConnection(String inetAddress)  {
        this.inetAddress = inetAddress;

    }


    public void conEst() throws Exception {

        Connection clientConnection = new ClientConnectionBuilder(inetAddress).setPort(PORT).build();

            ClientEventListener clientEventListener = new ClientEventListener();
            clientConnection.startDataTransfer(clientEventListener);

            clientConnection.setConnectionListener(clientEventListener);

            System.out.println("KKK");
            clientConnection.interrogation(255, CauseOfTransmission.ACTIVATION, new IeQualifierOfInterrogation(20));
            System.out.println("KKK2");

            //clientConnection.stopDataTransfer();
    }


    public static void main(String[] args) throws Exception {

        //SpringApplication.run(IecApplication.class, args);

        RealCLientConnection realCLientCponnection = new RealCLientConnection("127.0.0.1");
        realCLientCponnection.conEst();


    }

}

