package com.example.spring2;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Spring2Application {

    public static void main(String[] args) {
        SpringApplication sApp = new SpringApplication(Spring2Application.class);
        sApp.setBannerMode(Banner.Mode.OFF);
        sApp.run(Spring2Application.class, args);
    }

}