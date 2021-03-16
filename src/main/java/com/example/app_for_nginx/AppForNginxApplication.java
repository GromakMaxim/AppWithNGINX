package com.example.app_for_nginx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.app_for_nginx")
public class AppForNginxApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppForNginxApplication.class, args);
    }

}
