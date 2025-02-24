📌 UC3 - Employee Payroll App (DTO Implementation)

This update introduces DTO (Data Transfer Object) in the Employee Payroll Application. DTO helps in transferring data between layers while keeping the entity structure separate.

✅ Features Added in UC3

Introduced EmployeeDTO to handle data transfer.

Updated EmployeePayrollController to use DTO for creating and retrieving employees.

No Service Layer yet (it will be implemented in UC4).

📂 Project Structure

com.payroll.employee_payroll
│── controller
│── dto
│── model
│── EmployeePayrollApplication.java

🔧 Changes in UC3

Implemented EmployeeDTO to store only name and salary fields.

Modified EmployeePayrollController to include new endpoints for handling employees using DTO.

Added createEmployee and getEmployee endpoints for testing DTO functionality.

🚀 API Endpoints

Method	Endpoint	Description

POST	/employees/DTO/create	Create an employee using DTO

GET	/employees/DTO/get/{name}/{salary}	Fetch employee details using path variables

🏃‍♂️ Testing via CURL

Create an Employee

curl -X POST -H "Content-Type: application/json" -d '{"name": "Raj", "salary": 50000}' http://localhost:8080/employees/DTO/create

Get Employee Details

curl -X GET http://localhost:8080/employees/DTO/get/Raj/50000

📌 Next Steps

UC4 will introduce the Service Layer to separate business logic from the controller.

Database integration will be added in upcoming use cases.