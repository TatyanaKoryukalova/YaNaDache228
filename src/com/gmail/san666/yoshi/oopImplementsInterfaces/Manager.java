package com.gmail.san666.yoshi.oopImplementsInterfaces;

public class Manager implements Worker {
    private String name;
    private int age;
    private double salary;
    private String companyName;

    @Override
    public void setCompanyName(String name) {
        this.companyName = name;
    }

    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int   getAge() {
        return age;
    }
}
