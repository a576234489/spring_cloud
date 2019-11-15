package com.lhx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerNativeApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerNativeApplication.class,args);
    }
}
