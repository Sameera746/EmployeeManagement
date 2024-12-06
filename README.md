# Employee and Department Management System

This project is a **Spring Boot** application designed to manage employees and departments. It includes RESTful endpoints to perform various operations and an optional Angular frontend to interact with the backend services.

---

## Features

- Manage employees and departments
- Retrieve top 10 employees by department
- Retrieve highest-earning employees
- HSQL Database integration for in-memory storage
- Exception handling with custom exceptions
- Angular frontend using `ag-grid` for data display (optional)

---

## Technologies Used

- **Backend:**
  - Spring Boot
  - Spring Data JPA
  - HSQL Database (in-memory)
  - Lombok (for boilerplate code reduction)
  - Maven (build tool)
- **Frontend (Optional):**
  - Angular
  - ag-grid-angular (for data tables)
- **Testing:**
  - JUnit 5

---

## Prerequisites

- Java 17+
- Maven
- Node.js (for the optional Angular frontend)

---

## Setup Instructions

### Backend

1. Clone the repository:

   ```bash
   git clone https://github.com/Sameera746/EmployeeManagement
   cd EmployeeManagement
   ```

2. Build the project:

   ```bash
   mvn clean install
   ```

3. Run the project:

   ```bash
   mvn spring-boot:run
   ```

4. Access the backend at `http://localhost:8080`.

### Frontend (Optional)

1. Navigate to the Angular project directory:

   ```bash
   cd EmployeeManagementUI
   ```

2. Install dependencies:

   ```bash
   npm install
   ```

3. Start the Angular server:

   ```bash
   ng serve
   ```

4. Access the frontend at `http://localhost:4200`.

---

## API Endpoints

### Employee Endpoints

1. **Get Top 10 Employees by Department:**

   - **URL:** `/employees/top10`
   - **Method:** `GET`
   - **Query Param:** `departmentName`
   - **Response:** JSON list of top 10 employees.

2. **Get Highest-Earning Employees:**
   - **URL:** `/employees/highest-earning`
   - **Method:** `GET`
   - **Response:** JSON list of highest-earning employees.

## Testing

Run tests with:

```bash
mvn test
```

## Optional Features

- Implement infinite scrolling in Angular for large datasets.
- Enhance backend to support paginated endpoints.
