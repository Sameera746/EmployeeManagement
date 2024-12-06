package com.org.management.entity;

import lombok.Data;
import jakarta.persistence.*;

@Entity
@Data // Lombok will generate getters, setters, toString, equals, hashCode
@Table(name = "DEPARTMENT")
public class Department {

    @Id
    @Column(name = "dep_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer depId;

    @Column(name = "dep_name") // Mapping the 'dep_name' column in the database to the 'depName' field in the
    private String depName;

    @Column(name = "dep_desc") // Mapping the 'dep_desc' column in the database to the 'depDesc' field in the
    private String depDesc;

    // Lombok will generate the default constructor, getter, setter, equals,
    // hashCode, and toString methods for the fields
}