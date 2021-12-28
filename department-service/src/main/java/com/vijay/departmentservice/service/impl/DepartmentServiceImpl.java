package com.vijay.departmentservice.service.impl;

import com.vijay.departmentservice.model.Department;
import com.vijay.departmentservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private MongoTemplate mongoTemplate;
    @Override
    public Department saveDept(Department department) {
        return null;
    }

    @Override
    public Department findByDeptId(long deptId) {
        return null;
    }
}
