package com.codingdojo.counter;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class CounterController {
    @RequestMapping("/")
    public RedirectView index(RedirectView redirect) {
        redirect.setUrl("/counter");
        return redirect;
    }

    @RequestMapping("/counter")
    public String counter(HttpSession session) {
        if (session.getAttribute("counter") != null) {
            Integer counter = (Integer) session.getAttribute("counter");
            counter++;
            session.setAttribute("counter", counter);
        } else {
            session.setAttribute("counter", 1);
        }
        return "counter.jsp";
    }

    @RequestMapping("/doubleit")
    public RedirectView doubleIt(RedirectView redirect, HttpSession session) {
        Integer counter = (Integer) session.getAttribute("counter");
        counter++;
        session.setAttribute("counter", counter);
        redirect.setUrl("/counter");
        return redirect;
    }

    @RequestMapping("/clear")
    public RedirectView clear(RedirectView redirect, HttpSession session) {
        session.removeAttribute("counter");
        redirect.setUrl("/counter");
        return redirect;
    }
}
