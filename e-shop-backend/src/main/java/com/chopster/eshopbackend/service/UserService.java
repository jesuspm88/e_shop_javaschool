package com.chopster.eshopbackend.service;

import com.chopster.eshopbackend.exception.UserNotFoundException;
import com.chopster.eshopbackend.model.User;
import com.chopster.eshopbackend.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService {
    private final UserRepo userRepo;

    @Autowired
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

    public User findUserById(Integer id){
        return userRepo.findUserById(id).orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found."));
    }

    public void deleteUser(Integer id){
        userRepo.deleteUserById(id);
    }
}
