package com.tichu.network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class RelayServer {
    public static void main(String[] args){
        try{
            ServerSocket serverSocket = new ServerSocket(1234);
            GameRoom room = new GameRoom();
            while (true){
                Socket clientSocket = serverSocket.accept();
                new ClientHandler(clientSocket, room).start();
            }
        } catch (IOException e) {
            System.err.println("Error starting server: " + e.getMessage());
        }
    }
}
