package com.codingdojo.burgers.services;

import com.codingdojo.burgers.models.Burger;
import com.codingdojo.burgers.repositories.BurgerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@RequiredArgsConstructor
@Service
public class BurgerService {
    private final BurgerRepository repository;

    public List<Burger> allBurgers() {
        return repository.findAll();
    }

    public Burger create(Burger burger) {
        return repository.save(burger);
    }
}