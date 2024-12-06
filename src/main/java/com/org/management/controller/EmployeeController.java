package com.org.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.org.management.entity.Employee;
import com.org.management.exceptions.DepartmentNotFoundException;
import com.org.management.service.DepartmentService;
import com.org.management.service.EmployeeService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private DepartmentService departmentService;

    /**
     * Fetches the top 10 earning employees in a given department.
     * 
     * @param departmentName the name of the department
     * @return list of top 10 earning employees in the department
     */
    @GetMapping("/top10")
    public List<Employee> getTop10EmployeesByDepartment(@RequestParam String departmentName) {
        logger.info("Fetching top 10 earning employees in department: {}",
                departmentName);

        // Validate if department exists
        if (departmentService.getDepartmentByName(departmentName) == null) {
            logger.error("Department with name '{}' does not exist.", departmentName);
            throw new DepartmentNotFoundException("Department not found: " +
                    departmentName);
        }

        List<Employee> topEmployees = employeeService.getTop10EmployeesByDepartment(departmentName);

        if (topEmployees.isEmpty()) {
            logger.warn("No employees found in department: {}", departmentName);
        } else {
            logger.info("Successfully fetched top 10 employees in department: {}",
                    departmentName);
        }

        return topEmployees;
    }

    /**
     * Fetches the highest earning employee(s) across all departments.
     * 
     * @return list of the highest earning employee(s)
     */
    @GetMapping("/highest-earning")
    public List<Employee> getHighestEarningEmployees() {
        logger.info("Fetching highest earning employee(s) across all departments.");

        List<Employee> highestEarningEmployees = employeeService.getHighestEarningEmployees();

        if (highestEarningEmployees.isEmpty()) {
            logger.warn("No employees found with the highest salary.");
        } else {
            logger.info("Successfully fetched highest earning employee(s).");
        }

        return highestEarningEmployees;
    }
}
