package com.mindtree.departmentmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.departmentmvc.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
