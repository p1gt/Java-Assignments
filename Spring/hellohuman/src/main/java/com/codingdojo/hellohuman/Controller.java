package com.codingdojo.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("")
    public String root(@RequestParam(value="first_name", required=false, defaultValue="Human") String firstName,
                       @RequestParam(value="last_name", required=false, defaultValue="") String lastName,
                       @RequestParam(value="times", required = false) Integer times) {
        if (times > 0) {
            return String.valueOf(String.format("Hello %s %s ", firstName, lastName)).repeat(times);
        }
        return String.format("Hello %s %s ", firstName, lastName);
    }
}
