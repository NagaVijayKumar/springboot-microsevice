package com.vijay.departmentservice.service;

import com.vijay.departmentservice.model.Department;

public interface DepartmentService {
    Department saveDept(Department department);
    Department findByDeptId(long deptId);
}
