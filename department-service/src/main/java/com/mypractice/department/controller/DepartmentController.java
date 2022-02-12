package com.mypractice.department.controller;


import com.mypractice.department.entity.Department;
import com.mypractice.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable Long id){
        return departmentService.findDepartmentById(id);
    }

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("inside save department controller");
        return departmentService.saveDepartment(department);
    }
}
