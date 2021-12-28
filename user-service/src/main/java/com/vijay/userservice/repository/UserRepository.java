package com.vijay.userservice.repository;

import com.vijay.userservice.model.User;
import com.vijay.userservice.service.UserService;

import java.util.List;

public interface UserRepository {

    User saveUser(User user);

    User getUserByID(long id);

    List<User> getAllUsers();

    List<User>getUsersListByDepartmentId(long id);


}
