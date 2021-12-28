package com.vijay.userservice.service;

import com.vijay.userservice.model.User;

import java.util.List;

public interface UserService {

    User save(User user);

    User getUserByID(long id);

    List<User> getUseers();

    List<User>getUsersByDepartment(long id);

}
