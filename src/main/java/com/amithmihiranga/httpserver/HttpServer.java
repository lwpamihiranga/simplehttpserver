package com.amithmihiranga.httpserver;

import com.amithmihiranga.httpserver.core.ServerListenerThread;

import java.io.IOException;

/**
 * Driver class for HTTP Server
 */
public class HttpServer {
    public static void main(String[] args) throws IOException {
        System.out.println("Server starting...");

        ServerListenerThread serverListenerThread = new ServerListenerThread(8080);
        serverListenerThread.start();
    }
}
