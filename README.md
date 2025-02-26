Employee Payroll System - UC-10 (Validation) ✅

Overview 📝

This update introduces validation for the name field in both Create and Update REST API calls. The goal is to ensure that all employee names follow a proper format and prevent invalid data entry.

Validation Rules 🚦

✔️ The name cannot be empty.

✔️ The name must start with a capital letter.

✔️ The name must have at least 3 characters.

Setup Instructions ⚙️

1️⃣ Add the Hibernate Validator dependency to enable validation.

2️⃣ Apply validation annotations in the DTO class for the name field.

3️⃣ Modify the controller to enforce validation on incoming requests.


API Endpoints & Testing 🚀

1️⃣ Create Employee (Validation Applied)

❌ Invalid Request:

Name is empty or too short.
Name does not start with a capital letter.

📢 Response: "Name must start with a capital letter and have at least 3 characters."

✅ Valid Request:

Name follows the correct format.

📢 Response: Employee added successfully!

2️⃣ Update Employee (Validation Applied)

❌ Invalid Request:

Name does not meet validation criteria.

📢 Response: "Invalid name format."

✅ Valid Request:

Name meets the validation requirements.

📢 Response: Employee updated successfully!

Future Enhancements 🚀

🔹 Improve error messages for better clarity.

🔹 Implement global exception handling to manage validation errors efficiently.

🔹 Enhance security with authentication & authorization.

Author 👨‍💻
Deepanshu Malviya

🎉 UC-10 Validation Successfully Implemented! 🚀🔥