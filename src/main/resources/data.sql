INSERT INTO Department (dep_id, dep_name, dep_desc) VALUES
(1, 'HR', 'Handles recruitment, employee relations, and company policies'),
(2, 'IT', 'Manages company technology infrastructure and software development'),
(3, 'Finance', 'Oversees budgeting, accounting, and financial planning');

INSERT INTO Employee (emp_id, emp_name, emp_salary, dep_id) VALUES
(1, 'Alice Johnson', 5500.00, 1),
(2, 'Bob Smith', 5500.00, 1),
(3, 'Carol Davis', 5300.00, 1),
(4, 'David Wilson', 7000.00, 2),
(5, 'Eve Brown', 7200.00, 2),
(6, 'Frank Miller', 7100.00, 2),
(7, 'Grace Taylor', 7300.00, 2),
(8, 'Henry And', 6500.00, 3),
(9, 'Ivy Thomas', 6700.00, 3),
(10, 'Jack White', 6400.00, 3);
