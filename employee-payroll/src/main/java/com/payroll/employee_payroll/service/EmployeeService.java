package com.payroll.employee_payroll.service;

import com.payroll.employee_payroll.dto.EmployeeDTO;
import com.payroll.employee_payroll.model.EmployeeEntity;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements IEmployeeService {

    @Override
    public EmployeeEntity createEmployee(EmployeeDTO employeeDTO) {
        return new EmployeeEntity(employeeDTO);
    }

    @Override
    public EmployeeEntity getEmployee(String name, double salary) {
        return new EmployeeEntity(new EmployeeDTO(name, salary));
    }
}
