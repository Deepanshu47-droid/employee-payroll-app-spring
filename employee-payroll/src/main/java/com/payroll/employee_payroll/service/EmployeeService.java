package com.payroll.employee_payroll.service;

import com.payroll.employee_payroll.dto.EmployeeDTO;
import com.payroll.employee_payroll.model.EmployeeEntity;
import com.payroll.employee_payroll.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j // Enables logging
public class EmployeeService implements IEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public EmployeeEntity createEmployeeDTO(EmployeeDTO employeeDTO) {

        return new EmployeeEntity(employeeDTO);
    }

    @Override
    public EmployeeEntity getEmployeeDTO(String name, double salary) {
        log.info("Searching for Employee with Name: {} and Salary: {}", name, salary);
        return new EmployeeEntity(new EmployeeDTO(name, salary));
    }

    // Create Employee
    public EmployeeEntity createEmployeeList(EmployeeDTO employeeDTO) {
        EmployeeEntity employee = new EmployeeEntity(employeeDTO);
        employeeList.add(employee);
        log.info("Employee Created: {} ", employee);
        return employee;
    }

    // Get All Employees
    public List<EmployeeEntity> getAllEmployeesList() {
        log.info("Fetching all employees in list");
        return employeeList;
    }

    // Get Employee by Name
    public EmployeeEntity getEmployeeByNameList(String name) {
        log.info("Searching for Employee with Name: {} ", name);
        return employeeList.stream()
                .filter(emp -> emp.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    // Update Employee
    public EmployeeEntity updateEmployeeList(String name, EmployeeDTO employeeDTO) {

        log.info("Searching and updating the employee with name: {} and salary: {}", employeeDTO.getName(), employeeDTO.getSalary());
        for (EmployeeEntity employee : employeeList) {
            if (employee.getName().equalsIgnoreCase(name)) {
                employee.setName(employeeDTO.getName());
                employee.setSalary(employeeDTO.getSalary());
                return employee;
            }
        }
        return null;
    }

    // Delete Employee
    public boolean deleteEmployeeList(String name) {
        log.info("Searching and deleting the employee with name: {}", name);

        boolean isDeleted = employeeList.removeIf(emp -> emp.getName().equalsIgnoreCase(name));

        if (isDeleted) {
            log.info("Employee deleted successfully: {}", name);
        } else {
            log.error("Failed to delete Employee - Not Found: {}", name);
        }
        return isDeleted;
    }

    public void testLogging() {
        log.debug("This is a DEBUG message - visible in dev mode");
        log.info("This is an INFO message - visible in all modes");
        log.warn("This is a WARN message");
        log.error("This is an ERROR message");
    }


    // UC-9
    // Fetch all employees
    public List<EmployeeEntity> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // Add a new employee
    public EmployeeEntity addEmployee(EmployeeEntity employee) {
        return employeeRepository.save(employee);
    }


    // Get employee by ID
    public EmployeeEntity getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }


    // Update an employee
    public EmployeeEntity updateEmployee(Long id, EmployeeEntity employeeDetails) {
        Optional<EmployeeEntity> optionalEmployee = employeeRepository.findById(id);
        if (optionalEmployee.isPresent()) {
            EmployeeEntity employee = optionalEmployee.get();
            employee.setName(employeeDetails.getName());
            employee.setSalary(employeeDetails.getSalary());
            return employeeRepository.save(employee);
        }
        return null; // Employee not found
    }

    // Delete an employee
    public boolean deleteEmployee(Long id) {
        if (employeeRepository.existsById(id)) {
            employeeRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
