package com.codingdojo.exam.services;

import com.codingdojo.exam.models.Celebrity;
import com.codingdojo.exam.models.User;
import com.codingdojo.exam.repositories.CelebrityRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CelebrityService {
    private final CelebrityRepository celebRepo;

    public void createCelebrity(Celebrity celebrity) {
        celebRepo.save(celebrity);
    }

    public List<Celebrity> getAll() {
        return (List<Celebrity>) celebRepo.findAll();
    }

    public Celebrity get(Long id) {
        return celebRepo.findById(id).orElse(null);
    }

    public void update(Celebrity celebrity) {
        celebRepo.save(celebrity);
    }

    public void delete(Long id) {
        celebRepo.deleteById(id);
    }

    public List<Celebrity> search(String name) {
        return celebRepo.findByNameContaining(name);
    }

    public void follow(Long id, User currentUser) {
        Celebrity celebrity = celebRepo.findById(id).orElse(null);
        if (celebrity!=null) {
            celebrity.getFollowers().add(currentUser);
            celebRepo.save(celebrity);
        }
    }

    public void unfollow(Long id, User currentUser) {
        Celebrity celebrity = celebRepo.findById(id).orElse(null);
        if (celebrity!=null) {
            celebrity.getFollowers().remove(currentUser);
            celebRepo.save(celebrity);
        }
    }
}
