package com.example.employee.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Company {
    @Id
    @GeneratedValue
    private Integer id;

    @NotNull
    @Column(name = "companyName")
    private String companyName;

    @NotNull
    @Column(name = "employeesNumber")
    private Integer employeesNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(Integer employeesNumber) {
        this.employeesNumber = employeesNumber;
    }
}
