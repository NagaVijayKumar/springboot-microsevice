package com.vijay.departmentservice.controller;

import com.vijay.departmentservice.model.Department;
import com.vijay.departmentservice.service.DepartmentService;
import com.vijay.departmentservice.service.SequenceGeneratorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private SequenceGeneratorService sequenceGeneratorService;

    @Autowired
    private DepartmentService departmentService;


    @GetMapping("/check")
    public String test() {
        return "Department service up and running on port 9001";
    }

    @PostMapping(path = "/save")
    public Department saveDepartment(@RequestBody Department department) {
        log.info("save controller called in department");
        department.setDeptId(sequenceGeneratorService.generateSequence(Department.SEQUENCE_NAME));
        return departmentService.saveDepartment(department);
    }

    @GetMapping(path = "/departments/{id}")
    public Department getDepartmentById(@PathVariable long id){
        log.info("get department by id is called from department");
        return departmentService.findByDepartmentByDepId(id);
    }

    @GetMapping(path = "/departments")
    public List<Department> getAllDepartments(){
        return departmentService.getAllDepartments();
    }
}
