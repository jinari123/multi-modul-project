package com.temp.rpc.controller;

import com.temp.rpc.service.PromotionServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class TempServer {
    private final Server server;


    private PromotionServiceImpl ss;


    public TempServer(int port,PromotionServiceImpl ss) {
        this.server = ServerBuilder.forPort(port)
                .addService(ss)
                .build();
        this.ss =ss;
    }


    public void start() throws IOException {
        server.start();
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                TempServer.this.stop();
                System.err.println("*** server shut down");
            }
        });
    }

    private void stop() {
        if (server != null) {
            server.shutdown();      // 서버를 종료합니다.
        }
    }

    public void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();  // 서버가 SIGTERM을 받아서 종료될 수 있도록 await 합니다.
        }
    }
}
