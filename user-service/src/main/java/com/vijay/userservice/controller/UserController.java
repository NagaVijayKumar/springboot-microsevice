package com.vijay.userservice.controller;

import com.vijay.userservice.VO.UserWithDeptVO;
import com.vijay.userservice.model.User;
import com.vijay.userservice.service.SequenceGeneratorService;
import com.vijay.userservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.users.SparseUserDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private SequenceGeneratorService sequenceGeneratorService;

    @GetMapping(path = "/check")
    public String check(){
        return "User-Service is up and running on Port 9002";
    }

    @PostMapping(path = "/save")
    public User save(@RequestBody User user){
        log.info("UserController : save is called from user");
        user.setUserId(sequenceGeneratorService.generateSequence(User.SEQUENCE_NAME));
        return userService.save(user);
    }

    @GetMapping(path = "/users")
    public List<User>allUsers(){
        log.info("UserController : get users is called from user");
        return userService.getUseers();
    }

    @GetMapping(path = "/users/{id}")
    public User getUser(@PathVariable long id){
        log.info("UserController : get user by id is called from user");
        return userService.getUserByID(id);
    }

    @GetMapping(path = "/getUserWithDept/{userId}")
    public UserWithDeptVO getUserAndDept(@PathVariable long userId){
        log.info("get user with dept is called");
        log.info("Requested User is "+userId);
        return userService.getUserWithDepartment(userId);
    }
    @GetMapping(path = "/deptUsers/{id}")
    public List<User>getUsersWithDept(@PathVariable long deptId){
        return userService.getUsersByDepartment(deptId);
    }
}
