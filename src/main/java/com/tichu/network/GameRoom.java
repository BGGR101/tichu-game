package com.tichu.network;

import java.util.ArrayList;

public class GameRoom {
    private ArrayList<ClientHandler> clients = new ArrayList<>();

    public synchronized void addClient(ClientHandler client) {
        clients.add(client);
        broadcast(null, "A new player has joined the game. Total: " + clients.size());
    }

    public synchronized void broadcast(ClientHandler sender, String message) {
        for (ClientHandler client : clients) {
            if (client != sender) {
                client.send(message);
            }
        }
    }
}
