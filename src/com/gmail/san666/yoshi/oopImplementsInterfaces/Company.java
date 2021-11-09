package com.gmail.san666.yoshi.oopImplementsInterfaces;

import static java.util.Arrays.copyOf;

public class Company {
    private Person[] staff = new Person[0];
    private String name;

    //region constructors
    public Company(){

    }

    public Company(String name){
        this.name = name;
    }
    //endregion

    public void hirePerson(Person newWorker, double salary) {
        staff = copyOf(staff, staff.length + 1);
        staff[staff.length - 1] = newWorker;
        newWorker.setCompanyName(this.getName());
        newWorker.setSalary(salary);
    }

    public void firePerson(Person firedWorker) {
        Person[] newStaffArray = new Person[staff.length - 1];
        int counter = 0;
        for (Person person : staff) {
            if (person != firedWorker) {
                newStaffArray[counter] = person;
                counter++;
            }
        }
        staff = newStaffArray;
        firedWorker.setCompanyName(null);
        firedWorker.setSalary(0);
    }
    public void printAllStuffNames() {
        String staffNamesList = "";
        for (Person worker : staff) {
            staffNamesList = staffNamesList + worker.getName() + '\n';
        }
        System.out.println(staffNamesList);
    }

    public void printAllStuffNamesAndAge() {
        String staffNamesAndAgeList = "";
        for (Person worker : staff) {
            staffNamesAndAgeList = staffNamesAndAgeList + worker.getName() + ", "
                    + worker.getAge() + " y.o." + '\n';
        }
        System.out.println(staffNamesAndAgeList);
    }

    //region getters/setters
    public Person[] getStaff() {
        return staff;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getElement(int index) {
        return staff[index];
    }

    //endregion

}