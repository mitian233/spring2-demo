package cn.ac.mikan.spring2;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring2Application {

    public static void main(String[] args) {
        SpringApplication sApp = new SpringApplication(Spring2Application.class);
        sApp.setBannerMode(Banner.Mode.OFF);
        sApp.run(Spring2Application.class, args);
    }

}