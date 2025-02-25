package com.payroll.employee_payroll.service;

import com.payroll.employee_payroll.dto.EmployeeDTO;
import com.payroll.employee_payroll.model.EmployeeEntity;

import java.util.ArrayList;
import java.util.List;

public interface IEmployeeService {

    final List<EmployeeEntity> employeeList = new ArrayList<>();

    EmployeeEntity createEmployeeDTO(EmployeeDTO employeeDTO);
    EmployeeEntity getEmployeeDTO(String name, double salary);
    public EmployeeEntity createEmployee(EmployeeDTO employeeDTO);
    public List<EmployeeEntity> getAllEmployees();
    public EmployeeEntity getEmployeeByName(String name);
    public EmployeeEntity updateEmployee(String name, EmployeeDTO employeeDTO);
    public boolean deleteEmployee(String name);
}
