package com.codingdojo.daikichi;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("daikichi")
public class Controller {

    @RequestMapping("/")
    public String root() {
        return "Welcome!";
    }

    @RequestMapping("/today")
    public String today() {
        return "today you will find luck in all your endeavors!";
    }

    @RequestMapping("/tomorrow")
    public String tomorrow() {
        return "tomorrow an opportunity will arise, so be sure to be open to new ideas";
    }

    @RequestMapping("/travel/{place}")
    public String travel(@PathVariable("place") String place) {
        return String.format("Congratulations! You will soon travel to %s!", place);
    }

    @RequestMapping("lotto/{n}")
    public String lotto(@PathVariable("n") int n) {
        if (n % 2 == 0) {
            return "You will take a grand journey in the near future, but be weary of tempting offers";
        } else {
            return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
        }
    }
}
