package com.example.iec;

import com.example.iec.j60870.RealCLientConnection;

public class IecApplication {

    public static void main(String[] args) throws Exception {

        //SpringApplication.run(IecApplication.class, args);

        RealCLientConnection realCLientCponnection = new RealCLientConnection("127.0.0.1");
        realCLientCponnection.conEst();


    }

}
