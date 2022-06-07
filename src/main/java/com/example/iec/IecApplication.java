package com.example.iec;

import com.example.iec.j60870.CauseOfTransmission;
import com.example.iec.j60870.ClientConnectionBuilder;
import com.example.iec.j60870.Connection;
import com.example.iec.j60870.RealCLientCponnection;
import com.example.iec.j60870.ie.IeQualifierOfInterrogation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.InetAddress;

@SpringBootApplication
public class IecApplication {

    public static void main(String[] args) throws Exception {

        //SpringApplication.run(IecApplication.class, args);

        RealCLientCponnection realCLientCponnection = new RealCLientCponnection("127.0.0.1");
        realCLientCponnection.conEst();


    }

}
