package com.employee.controller;

import com.employee.model.Department;
import com.employee.model.Employees;
import com.employee.service.DepartmentService;
import com.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {

    private final EmployeeService empService;
    private final DepartmentService deptService;
    private String message;

    @Autowired
    public HomeController(final EmployeeService empService, final DepartmentService deptService) {
        this.empService = empService;
        this.deptService = deptService;
    }

    @RequestMapping(value="/add", method=RequestMethod.GET)
    public ModelAndView addEmployees() {
        ModelAndView modelAndView = new ModelAndView("add");
        modelAndView.addObject("employee", new Employees());
        List<Department> departments = deptService.listOfDepartments();
        modelAndView.addObject("departments", departments);
        return modelAndView;
    }

    @RequestMapping(value="/add", method=RequestMethod.POST)
    public ModelAndView addingConfirm(@ModelAttribute Employees employee) {
        ModelAndView modelAndView = new ModelAndView("confirm");
        if(validateIfEmptyField(employee)) {
            empService.addEmployees(employee);
            message = "Employee was successfully added.";
        } else {
            message = "Employee wasn't added. Please, insert all requested data";
        }
        modelAndView.addObject("message", message);
        return modelAndView;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView("index");
        List<Employees> employees = empService.listOfEmployees();
        modelAndView.addObject("employees", employees);
        return modelAndView;
    }

    @RequestMapping(value="/edit/{id}", method=RequestMethod.GET)
    public ModelAndView editEmployees(@PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView("edit");
        Employees employees = empService.getEmployees(id);
        modelAndView.addObject("employees", employees);
        List<Department> departments = deptService.listOfDepartments();
        modelAndView.addObject("departments", departments);
        return modelAndView;
    }

    @RequestMapping(value="/edit/{id}", method=RequestMethod.POST)
    public ModelAndView editConfirm(@ModelAttribute Employees employee, @PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView("index");
        if(validateIfEmptyField(employee)) {
            empService.editEmployees(employee);
        }
        List<Employees> employees = empService.listOfEmployees();
        List<Department> departments = deptService.listOfDepartments();
        modelAndView.addObject("department", departments);
        modelAndView.addObject("employees", employees);
        return modelAndView;
    }

    @RequestMapping(value="/remove/{id}", method=RequestMethod.GET)
    public ModelAndView removeEmployees(@PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView("confirm");
        empService.removeEmployees(id);
        message = "Employee was successfully deleted.";
        modelAndView.addObject("message", message);
        return modelAndView;
    }

    private boolean validateIfEmptyField(Employees employee) {
        if(employee.getName().equals("") || employee.getAddress().equals("")) return false;
        if (employee.getsalary() == null || employee.getPhone().equals("")) return false;
        if (employee.getDepartment().getId() == null) return false;
        return true;
    }
}
