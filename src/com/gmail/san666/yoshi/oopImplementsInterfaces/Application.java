package com.gmail.san666.yoshi.oopImplementsInterfaces;

public class Application {

    public static void main(String[] args) {
        Worker alex = new Person("Alex", 25);
        Worker mad = new Manager("Mad", 32);
        Person anny = new Person("Anny", 18);
        Company meta = new Company("Meta");

        meta.hirePerson(alex, 30000);
        meta.hirePerson(mad, 500000);
        meta.hirePerson(anny, 18000);
        meta.printAllStuffNames();
        meta.firePerson(alex);
        meta.printAllStuffNamesAndAge();
        System.out.println(mad.calculateIncomeTax());
        System.out.println(anny.calculateIncomeTax());
    }
}
