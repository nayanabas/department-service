package com.mypractice.department.service;


import com.mypractice.department.entity.Department;
import com.mypractice.department.repository.DepartmentRpository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRpository departmentRpository;

    public Department findDepartmentById(Long departmentId) {
        return  departmentRpository.findByDepartmentId(departmentId);
    }

    public Department saveDepartment(Department department) {
        log.info("inside service save method");
        return departmentRpository.save(department);
    }
}
