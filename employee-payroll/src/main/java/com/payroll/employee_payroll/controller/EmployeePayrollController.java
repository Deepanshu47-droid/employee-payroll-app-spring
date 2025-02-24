package com.payroll.employee_payroll.controller;

import com.payroll.employee_payroll.dto.EmployeeDTO;
import com.payroll.employee_payroll.model.EmployeeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeePayrollController {

    //Dummy mappings for uc2
    @GetMapping("/test")
    public String testConnection() {
        return "Employee Payroll Spring App is running!";
    }
    @GetMapping("/dummy/get/{id}")
    public String getEmployeeById(@PathVariable int id) {
        return "Fetching employee with ID: " + id;
    }

    @PostMapping("/dummy/create")
    public String createEmployee() {
        return "Creating new employee!";
    }

    @PutMapping("/dummy/update/{id}")
    public String updateEmployee(@PathVariable int id) {
        return "Updating employee with ID: " + id;
    }

    @DeleteMapping("/dummy/delete/{id}")
    public String deleteEmployee(@PathVariable int id) {
        return "Deleting employee with ID: " + id;
    }

    //mappings using DTO for uc3
    @PostMapping("/DTO/create")
    public EmployeeEntity createEmployee(@RequestBody EmployeeDTO employeeDTO) {
        EmployeeEntity employee = new EmployeeEntity(employeeDTO);
        return employee;
    }
    @GetMapping("/DTO/get/{name}/{salary}")
    public EmployeeEntity getEmployee(@PathVariable String name, @PathVariable double salary) {
        return new EmployeeEntity(new EmployeeDTO(name, salary)); // Returning employee details based on input
    }
}
