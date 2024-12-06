package com.org.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.management.entity.Department;
import com.org.management.repository.DepartmentRepository;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    /**
     * Fetches a department by its name.
     * 
     * @param departmentName the name of the department
     * @return the department if found, otherwise null
     */
    public Department getDepartmentByName(String departmentName) {
        // Search for a department by its name
        return departmentRepository.findByDepName(departmentName);
    }
}
