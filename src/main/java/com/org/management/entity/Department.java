package com.org.management.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_dep")
@Getter
@Setter
public class Department {

    @Id
    private Integer depId;

    private String depName;

    private String depDesc;
}
