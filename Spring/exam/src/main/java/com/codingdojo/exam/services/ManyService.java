package com.codingdojo.exam.services;

import com.codingdojo.exam.models.Celebrity;
import com.codingdojo.exam.models.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ManyService {
    private final UserService userServ;
    private final CelebrityService celebServ;

    public void followCelebrity(Long userId, Long celebId) {
        User user = userServ.findUserById(userId);
        Celebrity celeb = celebServ.get(celebId);
        List<Celebrity> celebs = user.getFollowings();
        celebs.add(celeb);
        user.setFollowings(celebs);
        userServ.saveUser(user);
    }

    public void unfollowCelebrity(Long userId, Long celebId) {
        User user = userServ.findUserById(userId);
        Celebrity celeb = celebServ.get(celebId);
        List<Celebrity> celebs = user.getFollowings();
        celebs.remove(celeb);
        user.setFollowings(celebs);
        userServ.saveUser(user);
    }

    public List<Celebrity> getFollowings(Long userId) {
        User user = userServ.findUserById(userId);
        return user.getFollowings();
    }
}
