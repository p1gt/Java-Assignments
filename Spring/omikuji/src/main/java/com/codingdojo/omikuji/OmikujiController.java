package com.codingdojo.omikuji;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class OmikujiController {
    @RequestMapping ("")
    public String root() {
        return "redirect:/omikuji";
    }

    @RequestMapping("omikuji")
    public String index() {
        return "index.jsp";
    }

    @RequestMapping(value = "omikuji/process", method = RequestMethod.POST)
    public String processingForm(@RequestParam("number") int number,
                                 @RequestParam("city") String city,
                                 @RequestParam("name") String name,
                                 @RequestParam("profession") String profession,
                                 @RequestParam("creature") String creature,
                                 @RequestParam("nice") String nice,
                                 HttpSession session) {
        session.setAttribute("number", number);
        session.setAttribute("city", city);
        session.setAttribute("name", name);
        session.setAttribute("profession", profession);
        session.setAttribute("creature", creature);
        session.setAttribute("nice", nice);
        return "redirect:/omikuji/show";
    }

    @RequestMapping ("omikuji/show")
    public String show(HttpSession session, Model model) {
        model.addAttribute("number", session.getAttribute("number"));
        model.addAttribute("city", session.getAttribute("city"));
        model.addAttribute("name", session.getAttribute("name"));
        model.addAttribute("profession", session.getAttribute("profession"));
        model.addAttribute("creature", session.getAttribute("creature"));
        model.addAttribute("nice", session.getAttribute("nice"));
        return "show.jsp";
        }
}
