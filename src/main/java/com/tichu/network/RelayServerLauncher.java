package com.tichu.network;

public class RelayServerLauncher {
    public static void startRelayServerInBackground() {
        new Thread(() -> {
            try{
                RelayServer.main(new String[0]);
            } catch (Exception e) {
                System.err.println("Error starting relay server: " + e.getMessage());
            }
        }, "RelayServerThread").start();
    }
}
