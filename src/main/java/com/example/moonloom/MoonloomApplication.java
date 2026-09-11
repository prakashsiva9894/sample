package com.example.moonloom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MoonloomApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoonloomApplication.class, args);

        // Automatically open browser on Windows
        try {
            String url = "http://localhost:8080/";
            Runtime.getRuntime().exec(new String[]{"cmd", "/c", "start " + url});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
