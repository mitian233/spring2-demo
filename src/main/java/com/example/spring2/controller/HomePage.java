package com.example.spring2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.spring2.method.getInfo;

@RestController
public class HomePage {
    @RequestMapping("/")
    public String homePage() {
        //String info = getInfo.getInstance().main("https://api-mfl.bangdream.moe/myLinks.json", "GET", null);
        //return info;
        return "Welcome to the home page!";
    }
}