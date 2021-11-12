package com.gmail.san666.yoshi.oopImplementsInterfaces;

import static java.util.Arrays.copyOf;

public class Company implements IdealCompany{
    private Worker[] staff;
    private String name;

    public Company(String name){
        this.name = name;
        this.staff = new Worker[0];
    }

    public void hirePerson(Worker newWorker, double salary) {
        staff = copyOf(staff, staff.length + 1);
        staff[staff.length - 1] = newWorker;
        newWorker.setCompanyName(this.getName());
        newWorker.setSalary(salary);
    }

    public void firePerson(Worker firedWorker) {
        Worker[] newStaffArray = new Worker[staff.length - 1];
        int counter = 0;
        for (Worker worker : staff) {
            if (worker != firedWorker) {
                continue;
            }
            newStaffArray[counter] = worker;
            counter++;
        }
        staff = newStaffArray;
        firedWorker.setCompanyName(null);
        firedWorker.setSalary(0);
    }
    public void printAllStuffNames() {
        String staffNamesList = "";
        for (Worker worker : staff) {
            staffNamesList = staffNamesList + worker.getName() + '\n';
        }
        System.out.println(staffNamesList);
    }

    public void printAllStuffNamesAndAge() {
        String staffNamesAndAgeList = "";
        for (Worker worker : staff) {
            staffNamesAndAgeList = staffNamesAndAgeList + worker.getName() + ", "
                    + worker.getAge() + " y.o." + '\n';
        }
        System.out.println(staffNamesAndAgeList);
    }

    //region getters/setters
    public Worker[] getStaff() {
        return staff;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Worker getElement(int index) {
        return staff[index];
    }

    //endregion

}