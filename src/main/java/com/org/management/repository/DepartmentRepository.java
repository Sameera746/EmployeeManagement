package com.org.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.management.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
    // Custom queries can be defined here if needed

    Department findByDepName(String depName);
}