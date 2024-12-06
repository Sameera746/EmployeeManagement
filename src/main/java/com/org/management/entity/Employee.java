package com.org.management.entity;

import lombok.Data;
import jakarta.persistence.*;

@Entity
@Data // Lombok will generate getters, setters, toString, equals, hashCode
@Table(name = "EMPLOYEE")
public class Employee {

    @Id
    @Column(name = "emp_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer empId; // Employee ID

    @Column(name = "emp_name")
    private String empName; // Employee Name

    @Column(name = "emp_salary")
    private Double empSalary; // Employee Salary

    @ManyToOne // Many employees belong to one department
    @JoinColumn(name = "dep_id", nullable = false) // This specifies the foreign key column
    private Department department; // Reference to the Department entity (foreign key)

    // Lombok will generate the necessary getters and setters for all fields
}
