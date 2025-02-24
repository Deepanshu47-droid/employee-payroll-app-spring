📄 UC2 - Employee Payroll Service 

🚀 Objective

Implement a basic REST Controller to demonstrate various HTTP methods and establish connectivity.

🛠 Steps Performed

✅ Created a REST Controller with different endpoints.

✅ Set up basic HTTP methods (GET, POST, PUT, DELETE).

✅ Tested REST APIs using cURL commands.


📌 Implemented Endpoints

HTTP Method	Endpoint	Description

🟢 GET	/employeepayrollservice/	Test connection

🟢 GET	/employeepayrollservice/get/{id}	Fetch employee by ID

🟡 POST	/employeepayrollservice/create	Create a new employee

🔵 PUT	/employeepayrollservice/update/{id}	Update employee details

🔴 DELETE	/employeepayrollservice/delete/{id}	Delete an employee

🖥 cURL Commands for Testing

# 🌐 Test Connection

curl localhost:8080/employeepayrollservice/ -w "\n"

# 📄 Get Employee by ID

curl localhost:8080/employeepayrollservice/get/1 -w "\n"

# ➕ Create Employee

curl -X POST localhost:8080/employeepayrollservice/create -w "\n"

# ✏️ Update Employee

curl -X PUT localhost:8080/employeepayrollservice/update/1 -w "\n"

# 🗑 Delete Employee

curl -X DELETE localhost:8080/employeepayrollservice/delete/1 -w "\n"
🎯 Outcome

✔️ Successfully established a RESTful service.

✔️ Verified API functionality using cURL.

✅ Next Step: Connect with MySQL Database! 🚀