Employee Payroll System - UC-9 (Database Operations)

Overview

This module (UC-9) provides CRUD operations for managing employee records in the database. The API supports the following operations:

Get all employees

Get an employee by ID

Add a new employee

Update an existing employee

Delete an employee

Technologies Used

Spring Boot (REST API)

MySQL (Database)

JPA/Hibernate (ORM)

Postman/cURL (API Testing)

Setup Instructions

1️⃣ Configure Database (MySQL)

Create the database before running the application:

CREATE DATABASE employee_payroll_db;
USE employee_payroll_db;

2️⃣ Update application.properties

Ensure your src/main/resources/application.properties contains:

spring.datasource.url=jdbc:mysql://localhost:3306/employee_payroll_db
spring.datasource.username=root
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

3️⃣ Run the Spring Boot Application

Start the application using:

mvn spring-boot:run

OR

java -jar employee-payroll-application.jar

API Endpoints

1️⃣ Get All Employees

Request:

GET /service/get/all

Response:

[
{"id": 1, "name": "Deepanshu", "salary": 50000},
{"id": 2, "name": "Raj", "salary": 60000}
]

2️⃣ Get Employee by ID

Request:

GET /service/get/{id}

Example Response:

{"id": 1, "name": "Deepanshu", "salary": 50000}

3️⃣ Add a New Employee

Request:

POST /service/add

Request Body:

{
"name": "Deepanshu",
"salary": 50000
}

Response:

{"id": 3, "name": "Deepanshu", "salary": 50000}

4️⃣ Update an Employee

Request:

PUT /service/update/{id}

Request Body:

{
"name": "Deepanshu Malviya",
"salary": 55000
}

Response:

{"id": 1, "name": "Deepanshu Malviya", "salary": 55000}

5️⃣ Delete an Employee

Request:

DELETE /service/delete/{id}

Response:

"Employee deleted successfully!"

Testing

Use Postman or cURL to test API requests.

Example cURL request to get all employees:

curl -X GET "http://localhost:8080/service/get/all" -H "Accept: application/json"

Future Enhancements

Implement pagination for large data retrieval.

Add error handling for invalid IDs.

Secure API using Spring Security & JWT Authentication.

Author

Deepanshu Malviya

✅ Project Completed: UC-9 Database Operations 🚀