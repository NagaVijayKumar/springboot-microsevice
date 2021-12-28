package com.vijay.departmentservice.repository;

import com.vijay.departmentservice.model.Department;

import java.util.List;

public interface DepartmentRepository {
    Department saveDeprtment(Department department);
    Department getDepartmentById(long id);

    List<Department> getAllDepartments();
}
