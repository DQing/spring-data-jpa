package com.example.employee.entity;

import javax.persistence.*;

@Entity
@Table(name = "Company")
public class Company {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String companyName;

    @Column
    private Long companyNumber;

    public Company() {
    }

    public Company(String companyName, Long companyNumber) {
        this.companyName = companyName;
        this.companyNumber = companyNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Long getCompanyNumber() {
        return companyNumber;
    }

    public void setCompanyNumber(Long companyNumber) {
        this.companyNumber = companyNumber;
    }
}
