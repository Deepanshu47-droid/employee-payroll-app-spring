package com.payroll.employee_payroll.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public class EmployeeDTO {
    private String name;
    private double salary;

}
