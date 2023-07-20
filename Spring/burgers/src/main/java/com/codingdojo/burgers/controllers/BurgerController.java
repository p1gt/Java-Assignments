package com.codingdojo.burgers.controllers;

import com.codingdojo.burgers.models.Burger;
import com.codingdojo.burgers.services.BurgerService;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class BurgerController {
    private final BurgerService service;

    public BurgerController(BurgerService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String index() {
        return "redirect:/burgers";
    }

    @GetMapping("/burgers")
    public String burgers(Model model) {
        List<Burger> burgers = service.allBurgers();
        model.addAttribute("burgers", burgers);
        return "burgers.jsp";
    }

    @GetMapping("/burgers/new")
    public String form(@ModelAttribute("burger") Burger burger) {
        return "create.jsp";
    }

    @PostMapping("/burgers/new")
    public String create(@Valid @ModelAttribute("burger") Burger burger, BindingResult result) {
        if (result.hasErrors()) {
            return "create.jsp";
        } else {
            service.create(burger);
        }
        return "redirect:/burgers";
    }

    @GetMapping("/burgers/{id}/edit")
    public String edit(@PathVariable("id") Long id, Model model) {
        Optional<Burger> burger = service.get(id);
        if (burger.isPresent()) {
            model.addAttribute("burger", burger.get());
            return "edit.jsp";
        } else {
            return "redirect:/burgers";
        }
    }

    @PostMapping("/burgers/update")
    public String update(@Valid @ModelAttribute("burger") Burger burger, BindingResult result) {
        if (result.hasErrors()) {
            return "edit.jsp";
        }
        service.update(burger);
        return "redirect:/burgers";
    }
}