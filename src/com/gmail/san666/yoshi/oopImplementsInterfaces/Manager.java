package com.gmail.san666.yoshi.oopImplementsInterfaces;

public class Manager implements Worker {
    private String name;
    private int age;
    private double salary;
    private String companyName;

    public Manager(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // region getters/setters
    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCompanyName() {
        return companyName;
    }

    @Override
    public void setCompanyName(String name) {
        this.companyName = name;
    }

    public double getSalary(double salary) {
        return salary;
    }

    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }
    //endregion
}
