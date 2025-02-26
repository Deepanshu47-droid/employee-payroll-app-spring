package com.payroll.employee_payroll.service;

import com.payroll.employee_payroll.dto.EmployeeDTO;
import com.payroll.employee_payroll.model.EmployeeEntity;

import java.util.ArrayList;
import java.util.List;

public interface IEmployeeService {


    final List<EmployeeEntity> employeeList = new ArrayList<>();


    EmployeeEntity createEmployeeDTO(EmployeeDTO employeeDTO);
    EmployeeEntity getEmployeeDTO(String name, double salary);
    public EmployeeEntity createEmployeeList(EmployeeDTO employeeDTO);
    public List<EmployeeEntity> getAllEmployeesList();
    public EmployeeEntity getEmployeeByNameList(String name);
    public EmployeeEntity updateEmployeeList(String name, EmployeeDTO employeeDTO);
    public boolean deleteEmployeeList(String name);
    public void testLogging();
    public List<EmployeeEntity> getAllEmployees();
    public EmployeeEntity addEmployee(EmployeeEntity employee);
    public EmployeeEntity getEmployeeById(Long id);
    public EmployeeEntity updateEmployee(Long id, EmployeeEntity employeeDetails);
    public void deleteEmployee(Long id);
}
