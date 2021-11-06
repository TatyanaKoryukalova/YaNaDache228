package com.gmail.san666.yoshi.oop;

import java.util.Arrays;

public class Company {
    private Person[] staff;
    private String name;

    //region constructors
    public Company(){

    }

    public Company(String name){
        this.name = name;
    }
    //endregion

    public void hirePerson(Person newWorker,double salary) {
        staff = Arrays.copyOf(staff, staff.length + 1);
        staff[staff.length - 1] = newWorker;
        newWorker.setCompanyName(this.getName());
        newWorker.setSalary(salary);
    }

    public void firePerson(Person firedWorker) {
        Person[] newStaffArray = new Person[staff.length - 1];
        int counter = 0;
        for (int i = 0; i < staff.length; i++) {
            Person person = staff[i];
            if (person != firedWorker) {
                newStaffArray[counter] = person;
                counter++;
            }
        }
        staff = newStaffArray;
        firedWorker.setCompanyName(null);
        firedWorker.setSalary(0);
    }
    public String listAllStuffNames() {
        String staffNamesList = "";
        for (Person worker : staff) {
            staffNamesList = staffNamesList + worker.getName() + '\n';
        }
        return staffNamesList;
    }

    public String listAllStuffNamesAndAge() {
        String staffNamesList = "";
        for (Person worker : staff) {
            staffNamesList = staffNamesList + worker.getName() + ", "
                    + worker.getAge() + "y.o." + '\n';
        }
        return staffNamesList;
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