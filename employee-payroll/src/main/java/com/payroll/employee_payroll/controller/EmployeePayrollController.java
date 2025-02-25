package com.payroll.employee_payroll.controller;

import com.payroll.employee_payroll.dto.EmployeeDTO;
import com.payroll.employee_payroll.model.EmployeeEntity;
import com.payroll.employee_payroll.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import lombok.extern.slf4j.Slf4j;
import java.util.List;

@RestController
@RequestMapping("/employees")
@Slf4j // Enables logging
public class EmployeePayrollController {

    //Autowired object of IEmployeeService Interface
    @Autowired
    private IEmployeeService employeeService;



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
    public EmployeeEntity createEmployeeDTO(@RequestBody EmployeeDTO employeeDTO) {
        EmployeeEntity employee = new EmployeeEntity(employeeDTO);
        return employee;
    }
    @GetMapping("/DTO/get/{name}/{salary}")
    public EmployeeEntity getEmployeeDTO(@PathVariable String name, @PathVariable double salary) {
        return new EmployeeEntity(new EmployeeDTO(name, salary)); // Returning employee details based on input
    }

    //mappings for uc4 implementation of service layer
    @PostMapping("/service/create")
    public EmployeeEntity createEmployeeService(@RequestBody EmployeeDTO employeeDTO) {
        log.info("Creating Employee using service layer: {}", employeeDTO);
        return employeeService.createEmployeeDTO(employeeDTO);
    }

    @GetMapping("/service/get/{name}/{salary}")
    public EmployeeEntity getEmployee(@PathVariable String name, @PathVariable double salary) {
        log.info("Fetching Employee using service layer: Name = {}, Salary = {}", name, salary);
        return employeeService.getEmployeeDTO(name, salary);
    }

    //Mappings for uc5 storing database using List data structure

    // Create Employee
    @PostMapping("/service/list/create")
    public EmployeeEntity createEmployee(@RequestBody EmployeeDTO employeeDTO) {
        log.info("Creating Employee: {}", employeeDTO);
        return employeeService.createEmployee(employeeDTO);
    }
    // Get All Employees
    @GetMapping("/service/list/getAll")
    public List<EmployeeEntity> getAllEmployees() {
        log.info("Fetching all employees...");
        return employeeService.getAllEmployees();
    }

    // Get Employee by Name
    @GetMapping("/service/list/get/{name}")
    public EmployeeEntity getEmployeeByName(@PathVariable String name) {
        log.info("Fetching Employee with Name: {}", name);
        return employeeService.getEmployeeByName(name);
    }

    // Update Employee
    @PutMapping("/service/list/update/{name}")
    public EmployeeEntity updateEmployee(@PathVariable String name, @RequestBody EmployeeDTO employeeDTO) {
        log.info("Updating Employee: {}", name);

        EmployeeEntity updatedEmployee = employeeService.updateEmployee(name, employeeDTO);

        if (updatedEmployee == null) {
            log.warn("Failed to update - Employee not found: {}", name);
        } else {
            log.info("Employee updated successfully: {}", updatedEmployee);
        }
        return updatedEmployee;
    }

    // Delete Employee
    @DeleteMapping("/service/list/delete/{name}")
    public String deleteEmployee(@PathVariable String name) {
        boolean isDeleted = employeeService.deleteEmployee(name);
        log.info("Deleting Employee: {}, Success: {}", name, isDeleted);

        return isDeleted ? "Employee deleted successfully" : "Employee not found";
    }

    @GetMapping("/testLogging")
    public String testLogging() {
        employeeService.testLogging();
        return "Logging has been tested. Check logs for details.";
    }
}
