package com.codingdojo.dojoninja.services;

import com.codingdojo.dojoninja.models.Dojo;
import com.codingdojo.dojoninja.repositories.DojoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class DojoService {
    private final DojoRepository dojoRepo;

    public List<Dojo> allDojos() {
        return (List<Dojo>) dojoRepo.findAll();
    }

    public void addDojo(Dojo dojo) {
        dojoRepo.save(dojo);
    }

    public Dojo getDojo(Long id) {
        return dojoRepo.findById(id).orElse(null);
    }
}
