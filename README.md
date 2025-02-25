Employee Payroll Application - UC5

📝 Use Case Overview

In this use case, the service layer stores employee payroll data in memory using a list. Instead of just handling business logic, the service layer now maintains a list of employees. This serves as a temporary step before integrating a database in future use cases.

📌 Key Enhancements in UC5

✔ Service Layer with List Implementation: Employee data is stored in a List instead of being created on the fly.

✔ CRUD Operations Implemented: Ability to create, retrieve, update, and delete employees.

✔ Separation of Concerns: The controller now delegates data management to the service layer.

✔ Testing API Endpoints via Postman or Swagger: Verify operations such as adding, retrieving, updating, and deleting employees.


📂 List Implementation Details

A List<EmployeeEntity> is used in the service layer to store employee data temporarily.

Employees are identified using name as the unique key for retrieval and modification.

No actual database is used yet; data is lost upon server restart.

🔄 API Endpoints Implemented

HTTP Method	Endpoint	Description

POST	/employees/service/create	Add a new employee

GET	/employees/service/getAll	Retrieve all employees

GET	/employees/service/get/{name}	Fetch employee details by name

PUT	/employees/service/update/{name}	Update employee information

DELETE	/employees/service/delete/{name}	Remove an employee from the list


🛠️ Testing Points

✔ Postman / Swagger can be used to test the API endpoints.

✔ Verify that employees are added to the list and retrieved correctly.

✔ Test edge cases such as updating or deleting non-existing employees.

✔ Confirm that data is lost upon restarting the application (since no database is used yet).
