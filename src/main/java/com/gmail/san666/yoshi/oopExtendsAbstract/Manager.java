package com.gmail.san666.yoshi.oopExtendsAbstract;

public class Manager extends AbstractWorker {

    public Manager(String name, int age) {
        setName(name);
        setAge(age);
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
}
