package com.payroll.employee_payroll.model;

import com.payroll.employee_payroll.dto.EmployeeDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.validation.constraints.Pattern;

import java.time.LocalDate;
import java.util.List;


@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "employees")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is required")
    @Pattern(regexp = "^[A-Z][a-zA-Z ]{2,}$", message = "Name must start with a capital letter and have at least 3 characters")
    private String name;

    @Min(value = 10000, message = "Salary must be at least 10000")
    private double salary;

    private String gender;
    private LocalDate startDate;
    private String note;
    private String profilePic;

    @ElementCollection
    private List<String> department;


    // Constructor using DTO
    public EmployeeEntity(EmployeeDTO employeeDTO) {
        this.name = employeeDTO.getName();
        this.salary = employeeDTO.getSalary();
        this.gender = employeeDTO.getGender();
        this.startDate = employeeDTO.getStartDate();
        this.note = employeeDTO.getNote();
        this.profilePic = employeeDTO.getProfilePic();
        this.department = employeeDTO.getDepartment();
    }
}