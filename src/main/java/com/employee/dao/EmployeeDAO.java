package com.employee.dao;

import com.employee.model.Employees;
import java.util.List;

public interface EmployeeDAO {
    List<Employees> listOfEmployees();
    void editEmployees(Employees employee);
    void addEmployees(Employees employee);
    void removeEmployees(int id);
    Employees getEmployees(int id);
}

