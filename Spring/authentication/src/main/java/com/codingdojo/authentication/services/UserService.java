package com.codingdojo.authentication.services;

import com.codingdojo.authentication.models.LoginUser;
import com.codingdojo.authentication.models.User;
import com.codingdojo.authentication.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import java.util.Optional;

@AllArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepo;

    public User findUserById(Long id) {
        Optional<User> optionalUser = userRepo.findById(id);
        return optionalUser.orElse(null);
    }

    public User register(User newUser, BindingResult result) {
        if (!(newUser.getUserName()).matches("^[a-zA-Z]*$")) {
            result.rejectValue("userName","Invalid","Use Letters only!");
        }
        if (userRepo.findByEmail(newUser.getEmail()).isPresent()) {
            result.rejectValue("email","Unique","This is a used email! Try another one.");
        }
        if (!newUser.getPassword().equals(newUser.getConfirm())) {
            result.rejectValue("confirm","Matches","Confirm password must match password.");
        }
        if (result.hasErrors()) {
            return null;
        }else {
            String hashedPW = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
            newUser.setPassword(hashedPW);
            return userRepo.save(newUser);
        }
    }
    public User login(LoginUser newLoginObject, BindingResult result) {
        if(result.hasErrors()) {
            return null;
        }
        Optional<User> potentialUser = userRepo.findByEmail(newLoginObject.getEmail());
        if (potentialUser.isEmpty()) {
            result.rejectValue("email","Unique","No such email!");
            return null;
        }
        User user = potentialUser.get();
        if (!BCrypt.checkpw(newLoginObject.getPassword(), user.getPassword())) {
            result.rejectValue("password","Matches","Wrong Password!");
        }
        if(result.hasErrors()) {
            return null;
        } else {
            return user;
        }
    }
}