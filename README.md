🚀 UC1: Employee Payroll Spring Project Initialization

📌 Objective

Set up the Employee Payroll Spring Boot Project to handle REST requests from the Employee Payroll UI instead of using JSON Server.

🛠 Steps Completed

✅ Step 1: Initialized Spring Boot Project

Group: com.employee

Artifact: employee-payroll

Project Type: Maven

Spring Boot Version: 3.x

✅ Step 2: Added Dependencies

Spring Boot Starter Web 🌐 (For building REST APIs)

Spring Boot Starter Data JPA 🗄 (For database interactions)

Lombok ✍️ (To reduce boilerplate code)

✅ Step 3: Created Project Structure

Main Class: EmployeePayrollApplication.java

Package Structure:

com.employee
├── EmployeePayrollApplication.java  (Main entry point)
├── controller (Will contain API endpoints)
├── model (Will contain Employee entity)
├── repository (Will contain database access logic)
├── service (Will contain business logic)
├── config (Will contain database configurations)

✅ Step 4: Configured Basic Application Properties

Defined application.properties for further database configurations.

✅ Step 5: Project Successfully Built and Started

Ran the application using:

mvn spring-boot:run

Verified that the server starts on port 8080.
