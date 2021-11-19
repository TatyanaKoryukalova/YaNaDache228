package com.gmail.san666.yoshi.oopExtendsAbstract;

public class Person extends AbstractWorker {

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public boolean isSalaryGreaterThanAge() {
        return getSalary() >= getAge();
    }

    public void salaryValidate(double salary) throws salaryLessThanAgeException {
        if (!isSalaryGreaterThanAge()) {
            throw new salaryLessThanAgeException("Salary cannot be less than age!");
        }
    }
}
