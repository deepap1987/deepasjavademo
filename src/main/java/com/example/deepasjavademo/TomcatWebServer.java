
package com.example.deepasjavademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


import java.util.Collections;

@SpringBootApplication
public class TomcatWebServer {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(TomcatWebServer.class);
        application.setDefaultProperties(Collections.singletonMap("server.port", "7777"));
        application.run(args);
    }
}
