package com.codingdojo.travels.repositories;

import com.codingdojo.travels.models.Expense;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelRepository extends CrudRepository<Expense, Long> {}