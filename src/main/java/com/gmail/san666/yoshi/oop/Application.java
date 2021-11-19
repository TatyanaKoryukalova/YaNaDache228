package com.gmail.san666.yoshi.oop;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Person alex = new Person("Alex", 78);
        Person bob = new Person("Bob", 25);

        Company google = new Company("google");
        google.hirePerson(bob, 500000);
        google.hirePerson(alex, 30000);
        google.hirePerson(alex, 30000);
        google.printAllStaffNamesAndAge();
        google.firePerson(bob);
        google.firePerson(bob);
        System.out.println();
        google.printAllStaffNames();

        System.out.println(alex.getCompanyName());
        System.out.println(bob.getCompanyName());
    }
}
