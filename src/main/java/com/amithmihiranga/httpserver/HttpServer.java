package com.amithmihiranga.httpserver;

import com.amithmihiranga.httpserver.core.ServerListenerThread;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Driver class for HTTP Server
 */
public class HttpServer {
    private final static Logger LOGGER = LoggerFactory.getLogger(HttpServer.class);

    public static void main(String[] args) throws IOException {
        LOGGER.info("Server starting...");

        ServerListenerThread serverListenerThread = new ServerListenerThread(8080);
        serverListenerThread.start();
    }
}
