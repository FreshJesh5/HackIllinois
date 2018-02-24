package com.hackbois.lan_platform;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

/**
 * Created by Fresh Jesh on 2/24/2018.
 */

public class ServerThread{
    private class ServerListenerThread extends Thread {

    }

    private class ServerSenderThread extends Thread {
    }

    private class ServerSocketHandler{
        static final int SocketServerPort = 8080;

        private ServerSocket serverSocket;

        private HashMap<Socket, String> socketUserMap = new HashMap();


        public void setSocketMap(Socket socket, String string){
            socketUserMap.put(socket, string);
        }

        public HashMap<Socket, String> getSocketMap(){
            return socketUserMap;
        }
    }







}
