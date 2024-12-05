package com.org.management.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
@Getter // Lombok generates getters for all fields
@Setter // Lombok generates setters for all fields
public class Employee {

    @Id
    private Integer empId; // Employee ID

    private String empName; // Employee Name

    private Double empSalary; // Employee Salary

    @ManyToOne // Many employees belong to one department
    @JoinColumn(name = "dep_id") // This specifies the foreign key column
    private Department department; // Reference to the Department entity (foreign key)

    // Lombok will generate the necessary getters and setters for all fields,
    // including the 'department' field
}
