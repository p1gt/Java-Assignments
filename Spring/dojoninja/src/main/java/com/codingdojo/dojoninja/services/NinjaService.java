package com.codingdojo.dojoninja.services;

import com.codingdojo.dojoninja.models.Ninja;
import com.codingdojo.dojoninja.repositories.NinjaRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class NinjaService {
    private final NinjaRepo ninjaRepo;

    public List<Ninja> allNinjas() {
        return (List<Ninja>) ninjaRepo.findAll();
    }

    public void addNinja(Ninja ninja) {
        ninjaRepo.save(ninja);
    }
}
