package com.codingdojo.burgers.repositories;

import com.codingdojo.burgers.models.Burger;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface BurgerRepository extends CrudRepository<Burger, Long> {}