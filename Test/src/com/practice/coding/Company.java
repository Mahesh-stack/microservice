package com.practice.coding;

import java.util.List;

public class Company {
    private int id;
    private String compName;
    private List<Employee> employees;

    public Company(int id, String compName, List<Employee> employees) {
        this.id = id;
        this.compName = compName;
        this.employees = employees;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", compName='" + compName + '\'' +
                ", employees=" + employees +
                '}';
    }
}
