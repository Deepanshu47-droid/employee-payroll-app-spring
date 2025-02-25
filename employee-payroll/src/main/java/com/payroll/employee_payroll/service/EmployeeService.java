package com.payroll.employee_payroll.service;

import com.payroll.employee_payroll.dto.EmployeeDTO;
import com.payroll.employee_payroll.model.EmployeeEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {

    @Override
    public EmployeeEntity createEmployeeDTO(EmployeeDTO employeeDTO) {

        return new EmployeeEntity(employeeDTO);
    }

    @Override
    public EmployeeEntity getEmployeeDTO(String name, double salary) {
        return new EmployeeEntity(new EmployeeDTO(name, salary));
    }

    // Create Employee
    public EmployeeEntity createEmployee(EmployeeDTO employeeDTO) {
        EmployeeEntity employee = new EmployeeEntity(employeeDTO);
        employeeList.add(employee);
        return employee;
    }

    // Get All Employees
    public List<EmployeeEntity> getAllEmployees() {
        return employeeList;
    }

    // Get Employee by Name
    public EmployeeEntity getEmployeeByName(String name) {
        return employeeList.stream()
                .filter(emp -> emp.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    // Update Employee
    public EmployeeEntity updateEmployee(String name, EmployeeDTO employeeDTO) {
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
    public boolean deleteEmployee(String name) {
        return employeeList.removeIf(emp -> emp.getName().equalsIgnoreCase(name));
    }
}
