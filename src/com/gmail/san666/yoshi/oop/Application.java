package com.gmail.san666.yoshi.oop;

public class Application {

    public static void main(String[] args) {
        Person alex = new Person();
        alex.setName("Alex");
        alex.setAge(78);
//        alex.setCompanyName("Abc");

        Person bob = new Person();
        bob.setName("Bob");
        bob.setAge(13);

//        bob.setSalary(15);
//        System.out.println(bob.getSalary());
//
        Company google = new Company();
        google.setStaff(new Person[]{bob});
        google.setName("Google");
        google.hirePerson(alex);
        google.printAllStuff();
        google.firePerson(bob);
        System.out.println();
        google.printAllStuff();


        System.out.println(alex.getCompanyName());
        System.out.println(bob.getCompanyName());


    }
}
