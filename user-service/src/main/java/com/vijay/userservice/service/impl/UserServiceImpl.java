package com.vijay.userservice.service.impl;

import com.vijay.userservice.VO.Department;
import com.vijay.userservice.VO.UserWithDeptVO;
import com.vijay.userservice.model.User;
import com.vijay.userservice.repository.UserRepository;
import com.vijay.userservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.jws.soap.SOAPBinding;
import java.util.List;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public User save(User user) {
        log.info("Save user called");
        return userRepository.saveUser(user);
    }

    @Override
    public User getUserByID(long id) {
        log.info("Get user by Id is called");
        return userRepository.getUserByID(id);
    }

    @Override
    public List<User> getUseers() {
        return userRepository.getAllUsers();
    }

    @Override
    public UserWithDeptVO getUserWithDepartment(long userId) {
        log.info("Get User and Dept with userId is called");
        UserWithDeptVO vo = new UserWithDeptVO();
        User user = userRepository.getUserByID(userId);
//        Department department = restTemplate.getForObject("http://localhost:9001/department/departments/"+user.getDepartmentId(),Department.class);
        //I'm Register with eureka client, so giving name is enough
        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/department/departments/"+user.getDepartmentId(),Department.class);

        vo.setUser(user);
        vo.setDepartment(department);

        return vo;
    }

    @Override
    public List<User> getUsersByDepartment(long id) {

        return null;
    }


}
