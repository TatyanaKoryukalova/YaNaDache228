package com.gmail.san666.yoshi.oopImplementsInterfaces;

import com.gmail.san666.yoshi.oopExtendsAbstract.SalaryLessThanAgeException;

public class Manager implements Worker {
    private String name;
    private int age;
    private double salary;
    private String companyName;

    public Manager(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private boolean isAgeGreaterThanSalary(double salary) {
        return getAge() >= salary;
    }

    @Override
    public void salaryValidate(double salary) {
        if (isAgeGreaterThanSalary(salary)) {
            throw new SalaryLessThanAgeException("Salary cannot be less than age!");
        }
    }

    @Override
    public double calculateIncomeTax() {
        return salary * 0.2;
    }

    @Override
    public String printName() {
        return name;
    }

    @Override
    public String printNameAndAge() {
        return name + ", " + age + "y.o.";
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

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }
    //endregion
}
