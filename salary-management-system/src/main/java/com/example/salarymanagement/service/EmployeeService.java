package com.example.salarymanagement.service;

import com.example.salarymanagement.entity.Employee;
import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee saveEmployee(Employee employee);
    Employee getEmployeeById(Long id);
    void deleteEmployee(Long id);
    List<Employee> searchEmployees(String keyword);
}