package com.gmail.san666.yoshi.oopImplementsInterfaces;

public class Application {

    public static void main(String[] args) {
        Person alex = new Person();
        alex.setName("Alex");
        alex.setAge(78);

        Person bob = new Person();
        bob.setName("Bob");
        bob.setAge(13);

        Company google = new Company();
        google.setName("Google");
        google.hirePerson(bob, 500000);
        google.hirePerson(alex, 30000);
        google.printAllStuffNamesAndAge();
        google.firePerson(bob);
        System.out.println();
        google.printAllStuffNames();

        System.out.println(alex.getCompanyName());
        System.out.println(bob.getCompanyName());
    }
}
