package com.codingdojo.exam.controllers;

import com.codingdojo.exam.models.Celebrity;
import com.codingdojo.exam.models.User;
import com.codingdojo.exam.services.CelebrityService;
import com.codingdojo.exam.services.UserService;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@Controller
@AllArgsConstructor
public class FanController {
    private final UserService userServ;
    private final CelebrityService celebServ;

    @GetMapping("/celebrity/new")
    public String newCelebrity(@ModelAttribute("celebrity") Celebrity celebrity, Model model, HttpSession session) {
        if (session.getAttribute("user_id")!=null) {
            Long userId = (Long) session.getAttribute("user_id");
            User currentUser = userServ.findUserById(userId);
            model.addAttribute("currentUser", currentUser);
            return "newCelebrity.jsp";
        }
        return "redirect:/";
    }

    @PostMapping("/celebrity/new")
    public String createCelebrity(@Valid @ModelAttribute("celebrity") Celebrity celebrity, BindingResult result, HttpSession session) {
        if (session.getAttribute("user_id")!=null) {
            if (result.hasErrors()) {
                return "newCelebrity.jsp";
            }
            Long userId = (Long) session.getAttribute("user_id");
            User currentUser = userServ.findUserById(userId);
            celebrity.setManager(currentUser);
            celebServ.createCelebrity(celebrity);
            return "redirect:/";
        }
        return "redirect:/";
    }

    @GetMapping("/celebrity/{id}")
    public String showCelebrity(@PathVariable("id") Long id, Model model, HttpSession session) {
        if (session.getAttribute("user_id")!=null) {
            Long userId = (Long) session.getAttribute("user_id");
            User currentUser = userServ.findUserById(userId);
            model.addAttribute("currentUser", currentUser);

            Celebrity celebrity = celebServ.get(id);
            model.addAttribute("celebrity", celebrity);
            return "showCelebrity.jsp";
        }
        return "redirect:/";
    }

    @GetMapping("/celebrity/{id}/update")
    public String editCelebrity(@ModelAttribute("celebrity") Celebrity celebrity, @PathVariable("id") Long id, Model model, HttpSession session) {
        if (session.getAttribute("user_id")!=null) {
            Long userId = (Long) session.getAttribute("user_id");
            User currentUser = userServ.findUserById(userId);
            model.addAttribute("currentUser", currentUser);

            if (Objects.equals(currentUser.getId(), celebServ.get(id).getManager().getId())) {
                Celebrity _celebrity = celebServ.get(id);
                model.addAttribute("celebrity", _celebrity);
                return "updateCelebrity.jsp";
            }
            return "error.jsp";
        }
        return "redirect:/";
    }

    @PostMapping("/celebrity/{id}/update")
    public String updateCelebrity(@Valid @ModelAttribute("celebrity") Celebrity celebrity, BindingResult result, @PathVariable("id") Long id, HttpSession session, Model model) {
        if (session.getAttribute("user_id")!=null) {
            if (result.hasErrors()) {
                return "updateCelebrity.jsp";
            }
            Long userId = (Long) session.getAttribute("user_id");
            User currentUser = userServ.findUserById(userId);
            model.addAttribute("celebrity", celebrity);
            celebrity.setManager(currentUser);
            celebServ.update(celebrity);
            return String.format("redirect:/celebrity/%d", id);
        }
        return "redirect:/";
    }

    @GetMapping("/celebrity/{id}/delete")
    public String deleteCelebrity(@PathVariable("id") Long id, HttpSession session) {
        if (session.getAttribute("user_id")!=null) {
            Long userId = (Long) session.getAttribute("user_id");
            User currentUser = userServ.findUserById(userId);
            if (Objects.equals(currentUser.getId(), celebServ.get(id).getManager().getId())) {
                celebServ.delete(id);
                return "redirect:/";
            }
            return "error.jsp";
        }
        return "redirect:/";
    }

    @GetMapping("/celebrity/search")
    public String searchCelebrity(@RequestParam("name") String name, Model model, HttpSession session) {
        if (session.getAttribute("user_id")!=null) {
            Long userId = (Long) session.getAttribute("user_id");
            User currentUser = userServ.findUserById(userId);
            model.addAttribute("currentUser", currentUser);
            model.addAttribute("name", name);
            model.addAttribute("celebrities", celebServ.search(name));
            return "searchCelebrity.jsp";
        }
        return "redirect:/";
    }

    @GetMapping("/celebrity/{id}/followers")
    public String celebFollowers(@PathVariable("id") Long id, Model model, HttpSession session) {
        if (session.getAttribute("user_id")!=null) {
            Long userId = (Long) session.getAttribute("user_id");
            User currentUser = userServ.findUserById(userId);
            model.addAttribute("currentUser", currentUser);
            model.addAttribute("celebrity", celebServ.get(id));
            model.addAttribute("followers", celebServ.get(id).getFollowers());
            return "showFollowers.jsp";
        }
        return "redirect:/";
    }

    @GetMapping("/celebrity/{id}/follow")
    public String followCelebrity(@PathVariable("id") Long id, HttpSession session) {
        if (session.getAttribute("user_id")!=null) {
            Long userId = (Long) session.getAttribute("user_id");
            User currentUser = userServ.findUserById(userId);
            celebServ.follow(id, currentUser);
            return String.format("redirect:/celebrity/%d", id);
        }
        return "redirect:/";
    }

    @GetMapping("/celebrity/{id}/unfollow")
    public String unfollowCelebrity(@PathVariable("id") Long id, HttpSession session) {
        if (session.getAttribute("user_id")!=null) {
            Long userId = (Long) session.getAttribute("user_id");
            User currentUser = userServ.findUserById(userId);
            celebServ.unfollow(id, currentUser);
            return String.format("redirect:/celebrity/%d", id);
        }
        return "redirect:/";
    }
}