package cn.ac.mikan.spring2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorld {
    @RequestMapping("/world") public String home1() {return "Hello World!";}
    @RequestMapping("/world/hi") public String home2() {return "Hello World Hi!";}
    @RequestMapping("") public String home() {return "Hello Home!";}

}
