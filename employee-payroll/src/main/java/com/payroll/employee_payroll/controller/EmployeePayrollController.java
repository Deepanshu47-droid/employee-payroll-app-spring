package com.payroll.employee_payroll.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeePayrollController {

    @GetMapping("/test")
    public String testConnection() {
        return "Employee Payroll Spring App is running!";
    }
    @GetMapping("/get/{id}")
    public String getEmployeeById(@PathVariable int id) {
        return "Fetching employee with ID: " + id;
    }

    @PostMapping("/create")
    public String createEmployee() {
        return "Creating new employee!";
    }

    @PutMapping("/update/{id}")
    public String updateEmployee(@PathVariable int id) {
        return "Updating employee with ID: " + id;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id) {
        return "Deleting employee with ID: " + id;
    }
}
