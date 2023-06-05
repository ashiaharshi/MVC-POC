package com.mindtree.departmentmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mindtree.departmentmvc.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

	@Query("Select d from Department d where d.departmentName=?1")
	Department findByName(String deptName);
}
