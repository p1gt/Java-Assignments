package com.codingdojo.travels.services;

import com.codingdojo.travels.models.Expense;
import com.codingdojo.travels.repositories.TravelRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class TravelService {
    private final TravelRepository repository;

    public List<Expense> allExpenses() {
        return (List<Expense>) repository.findAll();
    }

    public Optional<Expense> get(Long id) {
        return repository.findById(id);
    }

    public void create(Expense expense) {
        repository.save(expense);
    }

    public void update(Expense expense) {
        repository.save(expense);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
