package com.codingdojo.burgers.services;

import com.codingdojo.burgers.models.Burger;
import com.codingdojo.burgers.repositories.BurgerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class BurgerService {
    private final BurgerRepository repository;

    public List<Burger> allBurgers() {
        return (List<Burger>) repository.findAll();
    }

    public Optional<Burger> get(Long id) {
        return repository.findById(id);
    }

    public Burger create(Burger burger) {
        return repository.save(burger);
    }

    public Burger update(Burger burger) {
        return repository.save(burger);
    }
}