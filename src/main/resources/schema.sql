CREATE TABLE Department (
    dep_id INT PRIMARY KEY,
    dep_name VARCHAR(100),
    dep_desc VARCHAR(255)
);

CREATE TABLE Employee (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(100),
    emp_salary DECIMAL(10, 2),
    dep_id INT,
    FOREIGN KEY (dep_id) REFERENCES Department(dep_id)
);
