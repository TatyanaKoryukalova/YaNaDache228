package com.gmail.san666.yoshi.oop;

/**
 * TODO
 * V - 1. создать 1 статичное поле любого типа String попробовать поменять его у Боба и у Алекса; String companyName. ____Попробовали - шляпа
 * V(getter there) -  Должен быть статичный метод, который работает с этим полем.
 * V - 2. написать метод в этом классе, который проверяет, что зарплата не меньше, чем возраст - этот метод должен
 * возвращать boolean.
 * V - 3. Написать метод salaryValidate, который вызывает метод из пункта 2 и выкидывает исключения, если проверка не проходит.
 * V - 4. Написать класс Company, который хранит массив person и позволяет
 * добавлять новых person (методы должны называться типа "принять на работу" и "уволить").
 * V - 5. Класс Company должен иметь метод, который напечатает всех работников. У Company должен быть field name.
 */

public class Person {
    private String name;
    private int age;
    private double salary;
    private String companyName;

    public Person() {
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public boolean isSalaryGreaterThanAge(double salary) {
        return salary >= age;
    }

    public void salaryValidate(double salary) throws salaryInvalidException {
        if (!isSalaryGreaterThanAge(salary)) {
            throw new salaryInvalidException("Too little salary");
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
        try {
            salaryValidate(salary);
            this.salary = salary;
        } catch (salaryInvalidException e) {
            System.out.println("Зарплата не может быть меньше возраста");
        }
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    // endregion
}
