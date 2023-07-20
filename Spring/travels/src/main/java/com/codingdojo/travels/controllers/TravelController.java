package com.codingdojo.travels.controllers;

import com.codingdojo.travels.models.Expense;
import com.codingdojo.travels.services.TravelService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@AllArgsConstructor
@Controller
public class TravelController {
    private final TravelService service;

    @GetMapping("/")
    public String index() {
        return "redirect:/expenses";
    }

    @GetMapping("/expenses")
    public String expenses(Model model) {
        model.addAttribute("travels", service.allExpenses());
        return "expenses.jsp";
    }

    @GetMapping("/expenses/new")
    public String newExpense(@ModelAttribute("expense") Expense expense) {
        return "new.jsp";
    }

    @PostMapping("/expenses/new")
    public String createExpense(@Valid @ModelAttribute("expense") Expense expense, BindingResult result) {
        if (result.hasErrors()) {
            return "new.jsp";
        }
        service.create(expense);
        return "redirect:/expenses";
    }

    @GetMapping("/expenses/{id}/edit")
    public String editExpense(@PathVariable("id") Long id, Model model) {
        Optional<Expense> expense = service.get(id);
        if (expense.isPresent()) {
            model.addAttribute("expense", expense.get());
            return "edit.jsp";
        }
        return "redirect:/expenses";
    }

    @PostMapping("/expenses/update")
    public String update(@Valid @ModelAttribute("expense") Expense expense, BindingResult result) {
        if (result.hasErrors()) {
            return "edit.jsp";
        }
        service.update(expense);
        return "redirect:/expenses";
    }

    @GetMapping("/expenses/{id}/delete")
    public String delete(@PathVariable("id") Long id) {
        service.delete(id);
        return "redirect:/expenses";
    }

    @GetMapping("/expenses/{id}")
    public String show(@PathVariable("id") Long id, Model model) {
        Optional<Expense> expense = service.get(id);
        if (expense.isPresent()) {
            model.addAttribute("expense", expense.get());
            return "show.jsp";
        }
        return "redirect:/expenses";
    }
}
