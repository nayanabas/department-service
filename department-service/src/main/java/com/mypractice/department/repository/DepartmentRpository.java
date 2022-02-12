package com.mypractice.department.repository;

import com.mypractice.department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRpository extends JpaRepository<Department, Long> {
    Department findByDepartmentId(Long departmentId);
}
