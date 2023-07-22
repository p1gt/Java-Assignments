package com.codingdojo.dojoninja.controllers;

import com.codingdojo.dojoninja.models.Dojo;
import com.codingdojo.dojoninja.models.Ninja;
import com.codingdojo.dojoninja.services.DojoService;
import com.codingdojo.dojoninja.services.NinjaService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@AllArgsConstructor
@Controller
public class MainController {
    private final DojoService dojoService;
    private final NinjaService ninjaService;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("dojos", dojoService.allDojos());
        return "index.jsp";
    }

    @GetMapping("/dojo")
    public String dojo(@ModelAttribute("dojo") Dojo dojo) {
        return "dojo.jsp";
    }

    @PostMapping("/dojo")
    public String addDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
        if (result.hasErrors()) {
            return "dojo.jsp";
        }
        dojoService.addDojo(dojo);
        return "redirect:/";
    }

    @GetMapping("/ninja")
    public String ninja(@ModelAttribute("ninja") Ninja ninja, Model model) {
        model.addAttribute("dojos", dojoService.allDojos());
        return "ninja.jsp";
    }

    @PostMapping("/ninja")
    public String addNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("dojos", dojoService.allDojos());
            return "ninja.jsp";
        }
        ninjaService.addNinja(ninja);
        return "redirect:/";
    }

    @GetMapping("/dojo/{id}")
    public String showDojo(@PathVariable("id") Long id, Model model) {
        model.addAttribute("dojo", dojoService.getDojo(id));
        model.addAttribute("ninjas", dojoService.getDojo(id).getNinjas());
        return "showNinjas.jsp";
    }
}
