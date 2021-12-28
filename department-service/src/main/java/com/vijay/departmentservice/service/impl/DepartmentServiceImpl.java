package com.vijay.departmentservice.service.impl;

import com.vijay.departmentservice.model.Department;
import com.vijay.departmentservice.repository.DepartmentRepository;
import com.vijay.departmentservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.saveDeprtment(department);
    }

    @Override
    public Department findByDepartmentByDepId (long deptId) {
        return departmentRepository.getDepartmentById(deptId);
    }

    @Override
    public List<Department> getAllDepartments() {
        return departmentRepository.getAllDepartments();
    }
}
