package com.vijay.departmentservice.repository.impl;

import com.vijay.departmentservice.model.Department;
import com.vijay.departmentservice.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DepartmentRepositoryImpl implements DepartmentRepository {
    private final MongoTemplate mongoTemplate;

    @Autowired
    public DepartmentRepositoryImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

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
}
