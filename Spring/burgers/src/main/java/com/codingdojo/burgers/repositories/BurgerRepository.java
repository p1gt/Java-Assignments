package com.codingdojo.burgers.repositories;

import com.codingdojo.burgers.models.Burger;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BurgerRepository extends CrudRepository<Burger, Long> {
    List<Burger> findAll();

    Burger save(Burger burger);
}