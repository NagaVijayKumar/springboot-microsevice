package com.vijay.userservice.service.impl;

import com.vijay.userservice.model.User;
import com.vijay.userservice.repository.UserRepository;
import com.vijay.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public User save(User user) {
        return userRepository.saveUser(user);
    }

    @Override
    public User getUserByID(long id) {
        return userRepository.getUserByID(id);
    }

    @Override
    public List<User> getUseers() {
        return userRepository.getAllUsers();
    }

    @Override
    public List<User> getUsersByDepartment(long id) {
        return null;
    }
}
