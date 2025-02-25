package com.payroll.employee_payroll.service;

import com.payroll.employee_payroll.dto.EmployeeDTO;
import com.payroll.employee_payroll.model.EmployeeEntity;

public interface IEmployeeService {
    EmployeeEntity createEmployee(EmployeeDTO employeeDTO);
    EmployeeEntity getEmployee(String name, double salary);
}
