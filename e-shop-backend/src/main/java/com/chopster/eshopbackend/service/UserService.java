package com.chopster.eshopbackend.service;

import com.chopster.eshopbackend.exception.UserNotFoundException;
import com.chopster.eshopbackend.model.User;
import com.chopster.eshopbackend.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private final UserRepo userRepo;
    
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User addUser(User user){
        return userRepo.save(user);
    }

    public List<User> findAllUsers() {
        return userRepo.findAll();
    }

    public User updateUser(User user){
        return userRepo.save(user);
    }

    public User findUserById(Long id){
        return userRepo.findUserById(id).orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found."));
    }

    public void deleteUser(Long id){
        userRepo.deleteUserById(id);
    }
}
