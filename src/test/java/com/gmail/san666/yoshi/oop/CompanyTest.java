package com.gmail.san666.yoshi.oop;

import com.gmail.san666.yoshi.oop.Person;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {

    @Test
    void hirePerson() {
        Person alex = new Person("Alex", 22);
        Company google = new Company("Google");
        google.hirePerson(alex, 32000);
        assertThat(alex).isEqualTo(google.getStaff()[0]);
        assertThat(google.getStaff().length).isEqualTo(1);
        assertThat(alex.getSalary()).isEqualTo(32000);
        assertThat(alex.getCompanyName()).isEqualTo(google.getName());
    }

    @Test
    void firePersonTest() {

    }

    @Test
    void printAllStaffNames() {
    }

    @Test
    void printAllStaffNamesAndAge() {
    }
}