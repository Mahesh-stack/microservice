package com.practice.coding;

public class Employee {
    private int id;
    private String name;
    private String desg;
    private double salary;

    public Employee(int id, String name, String desg, double salary) {
        this.id = id;
        this.name = name;
        this.desg = desg;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesg() {
        return desg;
    }

    public void setDesg(String desg) {
        this.desg = desg;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desg='" + desg + '\'' +
                ", salary=" + salary +
                '}';
    }
}
