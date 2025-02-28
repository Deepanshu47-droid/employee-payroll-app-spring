package com.payroll.employee_payroll.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
public class EmployeeDTO {
    private String name;
    private double salary;
    private String gender;
    private LocalDate startDate;
    private String note;
    private String profilePic;
    private List<String> department;

}
