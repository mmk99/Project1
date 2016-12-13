package com.employee.service;

import com.employee.model.Department;
import com.employee.service.DepartmentService;
import com.employee.dao.DepartmentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentDAO departmentDAO;

    @Transactional(readOnly = true)
    public List<Department> listOfDepartments() {
            return departmentDAO.listOfDepartment();
        }
}
