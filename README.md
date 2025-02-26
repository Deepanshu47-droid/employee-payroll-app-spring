📌 UC11 - User-Friendly Error Response for Validation Failures

📖 Overview

In this use case, we implement custom exception handling to provide clear and structured error messages when validation fails.

🛠 Steps to Implement

1️⃣ Create a Global Exception Handler

Add a class named GlobalExceptionHandler in the com.payroll.employee_payroll.exception package.

Use @RestControllerAdvice so Spring Boot can automatically handle exceptions.

2️⃣ Define Validation Exception Handling

Create a method annotated with @ExceptionHandler(MethodArgumentNotValidException.class).

Extract validation errors and return a structured JSON response with field-specific messages.

3️⃣ Modify Employee Model with Validation Annotations

Apply @NotBlank, @Positive, @Min or other necessary validation annotations in the Employee model.


4️⃣ Ensure @Valid is Used in Controller

In the EmployeeController, modify the @PostMapping method to enforce validation:

5️⃣ Test with Invalid Data 🚨

🔹 Invalid Input:
{
"name": "",
"salary": -5000
}

🔹 Expected Response:

"message": "Validation failed. Check the errors field for details.",
"errors": {
"name": "Name must start with a capital letter and have at least 3 characters",
"salary": "Salary must be at least 10000"
},
"timestamp": "2025-02-26T19:55:12.5830392",
"status": 400
}

This response helps users understand what went wrong and how to fix it. 🛠️

🎯 Future Enhancements

🔹 Improve error messages for better clarity.

🔹 Implement global exception handling for other error types (e.g., NullPointerException).

🔹 Enhance security with authentication & authorization.


