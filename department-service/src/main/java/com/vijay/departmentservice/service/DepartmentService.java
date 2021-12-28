package com.vijay.departmentservice.service;

import com.vijay.departmentservice.model.Department;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);
    Department findByDepartmentByDepId(long deptId);

    List<Department> getAllDepartments();
}
