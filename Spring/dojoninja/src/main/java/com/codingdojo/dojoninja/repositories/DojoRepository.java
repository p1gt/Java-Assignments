package com.codingdojo.dojoninja.repositories;

import com.codingdojo.dojoninja.models.Dojo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DojoRepository extends CrudRepository<Dojo, Long> {}