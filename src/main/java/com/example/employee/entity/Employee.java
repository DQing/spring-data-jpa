package com.example.employee.entity;

import javax.persistence.*;

@Entity
@Table(name = "Employee")
public class Employee {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private Long age;

    @Column
    private String gender;

    @Column
    private Long companyId;

    @Column
    private Long salary;

    public Employee() {
    }

    public Employee(String name, Long age, String gender, Long companyId, Long salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.companyId = companyId;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }
}
