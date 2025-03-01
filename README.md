UC17: Retrieve Employees Belonging to Sales Department

Overview

This use case focuses on retrieving all employees who belong to the "Sales" department. Since an employee can belong to multiple departments, a separate table (employee_departments) is used to store department details. This requires using a custom query to filter employees based on their department.

Steps to Implement

1. Understand the Database Structure

employees table stores employee details.

employee_departments table maintains a many-to-many relationship between employees and departments.

Example:

| employees |
+----+--------+---------------+------------------------------------+-------------------------+---------+------------+
| id | gender | name          | note                               | profile_pic             | salary  | start_date |
+----+--------+---------------+------------------------------------+-------------------------+---------+------------+
|  1 | Male   | Malviya ji ji | Hardworking and dedicated employee | example.com/profile.jpg | 2000000 | 2024-01-15 |
+----+--------+---------------+------------------------------------+-------------------------+---------+------------+

| employee_departments |
+-------------+-----------------+
| employee_id | department      |
+-------------+-----------------+
|           2 | Engineering     |
|           2 | Cloud Computing |
|           3 | Sales           |
+-------------+-----------------+

2. Write a Custom Query to Fetch Employees in Sales Department

✅ Using JPQL Query

@Query("SELECT e FROM EmployeeEntity e JOIN e.department d WHERE d = 'Sales'")
List<EmployeeEntity> findEmployeesBySalesDepartment();

✅ Using Native SQL Query

@Query(value = "SELECT e.* FROM employees e " +
"JOIN employee_departments d ON e.id = d.employee_id " +
"WHERE d.department = 'Sales'", nativeQuery = true)
List<EmployeeEntity> findEmployeesBySalesDepartment();

3. Logging for Better Debugging

Add logs to ensure smooth execution and debugging:

Logger logger = LoggerFactory.getLogger(EmployeeService.class);

public List<EmployeeEntity> getSalesEmployees() {
logger.info("Fetching employees from Sales department...");
List<EmployeeEntity> employees = employeeRepository.findEmployeesBySalesDepartment();
logger.info("Found {} employees in Sales department", employees.size());
return employees;
}

4. Testing the Query

Run the query and verify that employees from the "Sales" department are correctly retrieved.

If no records are found, ensure that the employee_departments table contains valid entries.

Expected Output

When fetching employees from the "Sales" department, the output should be similar to:

ID: 3, Name: John Doe, Department: Sales, Salary: 1500000, Start Date: 2024-01-10

If no employees exist in "Sales", return an empty list.

Conclusion

Successfully retrieves employees belonging to the "Sales" department.

Uses custom queries to handle many-to-many relationships.

Ensures proper logging for debugging and performance monitoring.