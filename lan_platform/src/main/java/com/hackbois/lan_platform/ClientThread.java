package com.hackbois.lan_platform;

import java.net.Socket;
import java.util.HashMap;

/**
 * Created by Fresh Jesh on 2/24/2018.
 */

public class ClientThread extends Thread {
    private class ClientListenerThread extends Thread {

    }

    private class ClientSenderThread extends Thread {
    }

    private class ClientSocketHandler{
        private String dstAddress;
        static final int dstPort = 8080;
        private Socket socket_;

        public void setSocket (Socket socket){socket_= socket;}

        public Socket getSocket(){return socket_;}
    }

    public ClientThread(){}

    ClientSocketHandler socketHandler = new ClientSocketHandler();

    public void run(){
        if (socketHandler.getSocket() != null){

        }
    }




}
