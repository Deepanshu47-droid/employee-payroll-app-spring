🚀 UC15 - Saving Employee Payroll Data to MySQL DB (Already done)

## **📌 Overview**
This use case involves saving employee payroll data to a MySQL database using Spring Boot, Hibernate, and JPA.

## **✅ Steps to Implement**

### **1️⃣ Mark Employee Entity with `@Entity` Annotation**
- Use `@Entity` and `@Table(name = "employee_payroll")` annotations to map the class to a database table.
- Define columns such as `id`, `name`, `gender`, `startDate`, `note`, `profilePic`, and `department`.

### **2️⃣ Create a Repository Interface**
- Use `JpaRepository` to interact with the database.
- Define `EmployeeRepository` with basic CRUD operations.
- Spring Boot automatically provides the implementation for this interface.

### **3️⃣ Implement Service Layer for Saving Employee Data**
- Inject `EmployeeRepository` into the service class.
- Implement a method to save employee details.
- Use `employeeRepository.save(employee)` to store the data.
- Add logging to track operations.

### **4️⃣ Configure Database in `application.properties`**
- Set up MySQL database connection properties such as `spring.datasource.url`, `username`, `password`, and `driver-class-name`.
- Use `spring.jpa.hibernate.ddl-auto=update` for automatic table creation.

### **5️⃣ Test the API with a JSON Payload**
- Use Postman or any REST client to send a POST request with employee data.
- Ensure that the data is successfully inserted into the MySQL database.

### **6️⃣ Verify Data in MySQL**
- Run the SQL query `SELECT * FROM employee_payroll;` to check if the employee records are stored correctly.
- Validate that all fields are saved as expected.

## **🎯 Expected Outcome**
- Employee data should be successfully stored in the MySQL database.
- API should return a success response upon saving the data.
- Database should reflect the inserted records upon verification.

## **🔗 Next Steps**
- Implement update and delete operations for employee payroll data.
- Add exception handling for database-related errors.
- Improve validation and logging mechanisms for better debugging.

