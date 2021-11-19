package com.gmail.san666.yoshi.oopImplementsInterfaces;

import com.gmail.san666.yoshi.oop.Person;

import static java.util.Arrays.copyOf;

public class Company implements IdealCompany {
    private Worker[] staff;
    private String name;

    public Company(String name) {
        this.name = name;
        this.staff = new Worker[0];
    }

    @Override
    public void hirePerson(Worker newWorker, double salary) {
        if (isStaffMember(newWorker)) {
            System.out.println("This worker is staff member already");
            return;
        }
        staff = copyOf(staff, staff.length + 1);
        staff[staff.length - 1] = newWorker;
        newWorker.setCompanyName(this.getName());
        newWorker.setSalary(salary);
    }

    @Override
    public void firePerson(Worker firedWorker) {
        if (!isStaffMember(firedWorker)) {
            System.out.println("This worker is not staff member");
            return;
        }
        Worker[] newStaffArray = new Worker[staff.length - 1];
        int counter = 0;
        for (Worker worker : staff) {
            if (worker == firedWorker) {
                continue;
            }
            newStaffArray[counter] = worker;
            counter++;
        }
        staff = newStaffArray;
        firedWorker.setCompanyName(null);
        firedWorker.setSalary(0);
    }

    private boolean isStaffMember(Worker person) {
        for (Worker worker : staff) {
            if (person.equals(worker)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void printAllStuffNames() {
        for (Worker worker : staff) {
            System.out.println(worker.getName());
        }
    }

    @Override
    public void printAllStuffNamesAndAge() {
        for (Worker worker : staff) {
            System.out.println(worker.getName() + ", "
                    + worker.getAge() + " y.o.");
        }
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