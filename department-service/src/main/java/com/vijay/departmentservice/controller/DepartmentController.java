package com.vijay.departmentservice.controller;

import com.vijay.departmentservice.model.Department;
import com.vijay.departmentservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/check")
    public String test() {
        return "Department service up and running on port 9001";
    }

    @PostMapping(path = "/save")
    public Department saveDepartment(@RequestBody Department department) {

        return departmentService.saveDepartment(department);
    }

    @GetMapping(path = "/departments/{id}")
    public Department getDepartmentById(@PathVariable long id){
        return departmentService.findByDepartmentByDepId(id);
    }

    @GetMapping(path = "/departments")
    public List<Department> getAllDepartments(){
        return departmentService.getAllDepartments();
    }
}
