package com.gmail.san666.yoshi.oop;

import java.util.Arrays;

import static java.util.Arrays.*;

public class Company {
    private Person[] staff;
    private String name;

    public Company(String name) {
        this.name = name;
        this.staff = new Person[0];
    }

    public void hirePerson(Person newWorker, double salary) {
        if (isStaffMember(newWorker)) {
            System.out.println("This worker is staff member already");
            return;
        }
        staff = copyOf(staff, staff.length + 1);
        staff[staff.length - 1] = newWorker;
        newWorker.setCompanyName(this.getName());
        newWorker.setSalary(salary);
    }

    public void firePerson(Person firedWorker) {
        if (!isStaffMember(firedWorker)) {
            System.out.println("This worker is not staff member");
            return;
        }
        Person[] newStaffArray = new Person[staff.length - 1];
        int counter = 0;
        for (Person person : staff) {
            if (person == firedWorker) {
                continue;
            }
            newStaffArray[counter] = person;
            counter++;
        }
        staff = newStaffArray;
        firedWorker.setCompanyName("This person doesn't work anywhere");
        firedWorker.setSalary(0);
    }

    private boolean isStaffMember(Person worker) {
        for (Person person : staff) {
            if (worker == person) {
                return true;
            }
        }
        return false;
    }

    public void printAllStaffNames() {
        String staffNamesList = "";
        for (Person worker : staff) {
            staffNamesList += worker.getName() + '\n';
        }
        System.out.println(staffNamesList);
    }

    public void printAllStaffNamesAndAge() {
        String staffNamesAndAgeList = "";
        for (Person worker : staff) {
            staffNamesAndAgeList += worker.getName() + ", "
                    + worker.getAge() + " y.o." + '\n';
        }
        System.out.println(staffNamesAndAgeList);
    }

    //region getters/setters
    public Person[] getStaff() {
        return staff;
    }

    public void setStaff(Person[] staff) {
        this.staff = staff;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //endregion

}