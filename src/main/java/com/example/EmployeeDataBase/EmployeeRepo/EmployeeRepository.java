package com.example.EmployeeDataBase.EmployeeRepo;

import com.example.EmployeeDataBase.EmployeeModel.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {



}
