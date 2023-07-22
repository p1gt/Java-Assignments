package com.codingdojo.dojoninja.repositories;

import com.codingdojo.dojoninja.models.Ninja;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NinjaRepo extends CrudRepository<Ninja, Long> {
}
