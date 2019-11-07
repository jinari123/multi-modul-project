package com.temp.rpc.server;

import com.temp.rpc.controller.TempServer;
import com.temp.rpc.service.PromotionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.io.IOException;

@SpringBootApplication(scanBasePackages = "com.temp.rpc.**")
@EnableJpaRepositories(basePackages = "com.temp.rpc.entity")
@EntityScan(basePackages = "com.temp.rpc.entity")
public class ServerApplication implements CommandLineRunner {

    @Autowired
    private PromotionServiceImpl promotionService;

    public static void main(String[] args) throws IOException, InterruptedException {
        SpringApplication.run(ServerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        TempServer server = new TempServer(8090, promotionService);

        server.start();
        server.blockUntilShutdown();

    }
}
