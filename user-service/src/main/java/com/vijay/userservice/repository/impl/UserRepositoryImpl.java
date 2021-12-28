package com.vijay.userservice.repository.impl;

import com.vijay.userservice.model.User;
import com.vijay.userservice.repository.UserRepository;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private final MongoTemplate mongoTemplate;

    @Autowired
    public UserRepositoryImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public User saveUser(User user) {

        return mongoTemplate.save(user);
    }

    @Override
    public User getUserByID(long id) {
        return mongoTemplate.findById(id,User.class);
    }

    @Override
    public List<User> getAllUsers() {
        return mongoTemplate.findAll(User.class);
    }

    @Override
    public List<User> getUsersListByDepartmentId(long id) {
        return null;
    }

    /*


    @Override
    public Department saveDeprtment(Department department) {
       return mongoTemplate.save(department);
    }

    @Override
    public Department getDepartmentById(long id) {
        return mongoTemplate.findById(id, Department.class);
    }

    @Override
    public List<Department> getAllDepartments() {
        return mongoTemplate.findAll(Department.class);
    }
     */
}

