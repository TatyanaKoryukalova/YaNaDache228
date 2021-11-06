package com.gmail.san666.yoshi.oop;

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
        System.out.println(google.listAllStuffNames());
        google.firePerson(bob);
        System.out.println();
        System.out.println(google.listAllStuffNames());

        System.out.println(alex.getCompanyName());
        System.out.println(bob.getCompanyName());
    }
}
