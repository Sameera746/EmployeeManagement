package com.org.management.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.org.management.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // Custom query to find top 10 earning employees in a given department
    @Query("SELECT e FROM Employee e WHERE e.department.depName = :departmentName ORDER BY e.empSalary DESC")
    List<Employee> findTopTenByDepartmenDepName(@Param("departmentName") String departmentName, Pageable pageable);

    // Custom query to find the highest earning employee across all departments
    @Query("SELECT e FROM Employee e WHERE e.empSalary = (SELECT MAX(empSalary) FROM Employee)")
    List<Employee> findHighestEarningEmployees();
}
