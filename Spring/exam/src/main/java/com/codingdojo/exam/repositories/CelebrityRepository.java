package com.codingdojo.exam.repositories;

import com.codingdojo.exam.models.Celebrity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CelebrityRepository extends CrudRepository<Celebrity, Long> {
    List<Celebrity> findByNameContaining(String name);
}