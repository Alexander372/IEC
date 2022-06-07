package com.example.iec.j60870;

import java.io.IOException;

public class ClientEventListener implements ConnectionEventListener{
    public void newASdu(ASdu aSdu) {
        System.out.println("\nReceived ASDU:\n" + aSdu.toString());
    }

    @Override
    public void connectionClosed(IOException e) {
        System.out.println("Received connection closed signal. Reason: ");
        if (!e.getMessage().isEmpty()) {
            System.out.println(e.getMessage());
        } else {
            System.out.println("unknown");
        }

    }
}
