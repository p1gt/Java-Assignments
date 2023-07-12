package com.codingdojo.daikichi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/daikichi")
public class DaikichiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DaikichiApplication.class, args);
    }

    @RequestMapping("")
    public String root() {
        return "Welcome!";
    }

    @RequestMapping("today")
    public String today() {
        return "today you will find luck in all your endeavors!";
    }

    @RequestMapping("tomorrow")
    public String tomorrow() {
        return "tomorrow an opportunity will arise, so be sure to be open to new ideas";
    }
}
