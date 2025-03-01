package com.payroll.employee_payroll.repository;


import com.payroll.employee_payroll.model.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

    // Custom Query to get employees belonging to Sales department
    @Query("SELECT e FROM EmployeeEntity e JOIN e.department d WHERE d = 'Sales'")
    List<EmployeeEntity> findEmployeesBySalesDepartment();
}
