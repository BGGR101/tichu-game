package com.tichu.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientHandler extends Thread {
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;
    private GameRoom room;

    public ClientHandler(Socket socket, GameRoom room) {
        this.socket = socket;
        this.room = room;
    }

    public void run(){
        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);

            room.addClient(this);

            String message;
            while ((message = in.readLine()) != null) {
                room.broadcast(this, message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void send(String message) {
        out.println(message);
    }
}
