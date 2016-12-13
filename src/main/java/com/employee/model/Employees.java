package com.employee.model;

import javax.persistence.*;

@Entity
public class Employees {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    @OneToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(name="department")
    private Department department;
    private String address;
    private String phone;
    private Long salary;

    public Employees(Integer id, String name, Department department,  String address, String phone, Long salary) {
        this.id = id;
        this.name = name;
        this.department= department;
        this.address = address;
        this.phone = phone;
        this.salary = salary;
    }

    public Employees() {
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getsalary() {
        return salary;
    }

    public void setsalary(Long salary) {
        this.salary = salary;
    }
}