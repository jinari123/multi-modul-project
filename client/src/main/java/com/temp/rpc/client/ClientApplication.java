package com.temp.rpc.client;

import com.temp.rpc.client.service.Client;
import io.grpc.ManagedChannelBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(ClientApplication.class, args);
        Client client = new Client(ManagedChannelBuilder.forAddress("localhost",8090));
        client.getFeature(9909009);

    }
}
