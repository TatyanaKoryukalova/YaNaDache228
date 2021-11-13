package com.gmail.san666.yoshi.oopImplementsInterfaces;

public class Person implements Worker {
    private String name;
    private int age;
    private double salary;
    private String companyName;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean isSalaryGreaterThanAge(double salary) {
        return salary >= age;
    }

    public void salaryValidate(double salary) throws salaryLessThanAgeException {
        if (!isSalaryGreaterThanAge(salary)) {
            throw new salaryLessThanAgeException("Salary cannot be less than age!");
        }
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

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    @Override
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    // endregion
}
