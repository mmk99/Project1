package com.employee.service;

import com.employee.dao.EmployeeDAO;
import com.employee.model.Employees;
import com.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Transactional(readOnly = true)
    public List<Employees> listOfEmployees() {
        return employeeDAO.listOfEmployees();
    }

    @Transactional
    public void editEmployees(Employees employee) {
    	employeeDAO.editEmployees(employee);
    }

    @Transactional
    public void addEmployees(Employees employee) {
    	employeeDAO.addEmployees(employee);
    }

    @Transactional
    public void removeEmployees(int id) {
    	employeeDAO.removeEmployees(id);
    }

    @Transactional(readOnly = true)
    public Employees getEmployees(int id) {
    	Employees employee = employeeDAO.getEmployees(id);
        return employee;
    }
}
