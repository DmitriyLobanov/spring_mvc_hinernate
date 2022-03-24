package com.lobanov.service;

import com.lobanov.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public void SaveEmployee(Employee employee);
    public Employee getEmployee(int id);
    public void deleteEmployee(int id);
}
