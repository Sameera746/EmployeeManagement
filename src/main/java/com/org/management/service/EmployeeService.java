package com.org.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.org.management.entity.Employee;
import com.org.management.repository.EmployeeRepository;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    /**
     * Fetches top 10 employees by department name.
     * 
     * @param departmentName the name of the department
     * @return list of employees
     */
    public List<Employee> getTop10EmployeesByDepartment(String departmentName) {
        Pageable topTen = PageRequest.of(0, 10); // PageRequest for top 10 records
        return employeeRepository.findTopTenByDepartmenDepName(departmentName, topTen);
    }

    // Fetch highest earning employee across every department
    public List<Employee> getHighestEarningEmployees() {
        return employeeRepository.findHighestEarningEmployees();
    }
}
