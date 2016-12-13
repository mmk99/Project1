package com.employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Department {
	
    @Id
    @GeneratedValue
    @Column(name = "dept_id")
    private Integer id;
    private String name;
    private String dept_code;

    public Department() {
    }

    public Department(Integer id, String name, String dept_code) {
        this.id = id;
        this.name = name;
        this.dept_code = dept_code;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeptcode() {
        return dept_code;
    }

    public void setDeptcode(String deptcode) {
        this.dept_code = deptcode;
    }
}