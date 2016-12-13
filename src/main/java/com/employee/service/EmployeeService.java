package com.employee.service;

import com.employee.model.Employees;
import java.util.List;

public interface EmployeeService {
    List<Employees> listOfEmployees();
    void editEmployees(Employees employee);
    void addEmployees(Employees employee);
    void removeEmployees(int id);
    Employees getEmployees(int id);
}
