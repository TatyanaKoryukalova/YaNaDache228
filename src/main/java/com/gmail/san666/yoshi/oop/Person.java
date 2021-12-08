package com.gmail.san666.yoshi.oop;

/**
 * TODO
 * - 1. создать 1 статичное поле любого типа String попробовать поменять его у Боба и у Алекса; String companyName.
 * -  Должен быть статичный метод, который работает с этим полем. - посмотрели что static поле принадлежит в целом классу, а не экземплярам, меняестя для всех экземпляров.
 * в работе будет мешать и нарушит логику
 * - 2. написать метод в этом классе, который проверяет, что зарплата не меньше, чем возраст - этот метод должен
 * возвращать boolean.
 * - 3. Написать метод salaryValidate, который вызывает метод из пункта 2 и выкидывает исключения, если проверка не проходит.
 * - 4. Написать класс Company, который хранит массив person и позволяет
 * добавлять новых person (методы должны называться типа "принять на работу" и "уволить").
 * - 5. Класс Company должен иметь метод, который напечатает всех работников. У Company должен быть field name.
 */

public class Person {
    private String name;
    private int age;
    private double salary;
    private String companyName;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private boolean isAgeGreaterThanSalary(double salary) {
        return age >= salary;
    }

    public void salaryValidate() {
        if (isAgeGreaterThanSalary(this.salary)) {
            throw new SalaryLessThanAgeException("Salary cannot be less than age!");
        }
    }

    // region getters/setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    // endregion
}
