📌 UC-12 - Employee Not found exception
🚀 Ability to Throw User-Friendly Errors When Employee ID is Not Found
🔹 Objective:
✅ Ensure that meaningful error messages are provided when an invalid employee ID is passed.

📌 Features:
Define a custom exception for handling cases where an employee ID is not found.
Throw this exception when an employee ID does not exist in the database.
Use @ExceptionHandler in the global exception handler to catch and return a proper error response.
🔄 Steps Taken:
1️⃣ Created a custom exception class to handle "Employee Not Found" scenarios.
2️⃣ Updated service methods to throw this exception when an invalid ID is provided.
3️⃣ Handled the exception globally to return a structured error response instead of a generic error.

🎯 Expected Behavior:
If an employee ID exists, operations (fetch, update, delete) will proceed normally.
If an invalid employee ID is provided, a clear error message will be returned instead of system-generated errors.
🛠️ Future Enhancements:
🔹 Improve error messages for better clarity.
🔹 Implement detailed logging to track failed requests.
🔹 Enhance security with proper exception handling across all endpoints.